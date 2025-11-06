package ar.edu.unlp.info.oo1.ejercicio25;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JugadorTest {

	private Map<Jugador, Integer> goles;
	private Jugador jugador1;
	private Jugador jugador2;
	private Jugador jugador3;
	
	@BeforeEach
	void setUp() throws Exception {
		this.goles = new HashMap<>();
		this.jugador1 = new Jugador("Lionel","Messi");
		this.jugador2 = new Jugador("Gabriel","Batistuta");
		this.jugador3 = new Jugador("Kun","Aguero");
	}

	@Test
	void test() {
		// a) agregar tuplas
        goles.put(this.jugador1, 111);
        goles.put(this.jugador2, 56);
        goles.put(this.jugador3, 42);

        // b) eliminar la entrada con clave “Kun Agüero”
        goles.remove(this.jugador3);
        assertFalse(goles.containsKey(this.jugador3));

        // c) actualizar el valor de Messi
        goles.replace(this.jugador1, 112);
        assertEquals(112, goles.get(this.jugador1));

        // d) intentar repetir la clave “Gabriel Batistuta”
        Integer valorPrevio = goles.put(this.jugador2, 60);
        // Al usar put con una clave existente, se reemplaza el valor y devuelve el anterior
        assertEquals(56, valorPrevio);

        // e) calcular total de goles
        int total = goles.values().stream().mapToInt(Integer::intValue).sum();
        assertEquals(172, total); // 112 + 60 = 172
	}

}
