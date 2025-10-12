package ar.edu.unlp.info.oo1.ejercicio14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EsferaTest {

	private Esfera esfera;
	
	@BeforeEach
	void setUp() throws Exception {
		this.esfera = new Esfera("Hierro", "Verde",3);
	}

	@Test
	void testGetVolumen() {
		double esperado = (4.0/3.0)*Math.PI*Math.pow(3,3);
		assertEquals(esfera.getVolumen(),esperado);
	}
	
	@Test 
	void testGetSuperficie() {
		double esperado = 4*Math.PI*Math.pow(3, 2);
		assertEquals(esfera.getSuperficie(),esperado);
	}

}
