package ar.edu.unlp.info.oo1.ejercicio25;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

class MapTest {

	private Map<String, Integer> goles;
	
	@BeforeEach
	void setUp() throws Exception {
		this.goles = new HashMap<>();
	}

	@Test
	void testPedido() {
		// a) agregar tuplas
        goles.put("Lionel Messi", 111);
        goles.put("Gabriel Batistuta", 56);
        goles.put("Kun Aguero", 42);

        // b) eliminar la entrada con clave “Kun Aguero”
        goles.remove("Kun Aguero");
        assertFalse(goles.containsKey("Kun Aguero"));

        // c) actualizar el valor de Messi
        goles.replace("Lionel Messi", 112);
        assertEquals(112, goles.get("Lionel Messi"));

        // d) intentar repetir la clave “Gabriel Batistuta”
        Integer valorPrevio = goles.put("Gabriel Batistuta", 60);
        // Al usar put con una clave existente, se reemplaza el valor y devuelve el anterior
        assertEquals(56, valorPrevio);

        // e) calcular total de goles
        int total = goles.values().stream().mapToInt(Integer::intValue).sum();
        assertEquals(172, total); // 112 + 60 = 172
	}

}
