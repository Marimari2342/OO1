import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;
import java.util.HashMap;

public class GolesMapTest {

    private Map<String, Integer> jugadores;

    // creamos el mapa jugadores e insertamos las tuplas pedidas
    @BeforeEach
    public void setUp() {
        // Inicializar el mapa antes de cada prueba
        jugadores = new HashMap<>();
        jugadores.put("Lionel Messi", 111);
        jugadores.put("Gabriel Batistuta", 56);
        jugadores.put("Kun Agüero", 42);
    }

    // Usamos .remove() para eliminar la entrada de "Kun Agüero" y verificamos.
    @Test
    public void testEliminarJugador() {
        // Eliminar la entrada con clave "Kun Agüero"
        jugadores.remove("Kun Agüero");
        
        // Verificar que "Kun Agüero" ya no está en el mapa
        assertFalse(jugadores.containsKey("Kun Agüero"));
    }

    // Usamos put("Lionel Messi", 112) para actualizar el valor de goles de Messi y verificamos.
    @Test
    public void testActualizarGolesMessi() {
        // Actualizar la cantidad de goles de Messi
        jugadores.put("Lionel Messi", 112);
        
        // Verificar que el valor de goles de Messi ha sido actualizado
        assertEquals(112, jugadores.get("Lionel Messi"));
    }

    /*Intentamos agregar una nueva entrada con la misma clave "Gabriel Batistuta" pero con un valor 
     * diferente (60) y verificamos.*/
    @Test
    public void testRepetirClaveGabrielBatistuta() {
        // Intentar agregar una entrada con la misma clave "Gabriel Batistuta"
        jugadores.put("Gabriel Batistuta", 60); // Reemplaza el valor original
        
        // Verificar que el valor ha sido reemplazado y que no hay duplicados
        assertEquals(60, jugadores.get("Gabriel Batistuta"));
    }

    /*Calculamos la suma total de los valores del mapa utilizando values() y un stream y verificamos*/
    @Test
    public void testCalcularTotalGoles() {
        // Calcular el total de goles (suma de los valores)
        int totalGoles = jugadores.values().stream().mapToInt(Integer::intValue).sum();
        
        // Verificar que el total de goles es correcto
        assertEquals(112 + 56 + 42, totalGoles);
    }
}

