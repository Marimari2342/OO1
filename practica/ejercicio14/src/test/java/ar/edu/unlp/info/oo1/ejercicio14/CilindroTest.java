package ar.edu.unlp.info.oo1.ejercicio14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CilindroTest {

	private Cilindro cilindro;
	
	@BeforeEach
	void setUp() throws Exception {
		this.cilindro = new Cilindro("Madera","Naranja",2,5);
	}

	@Test
	void testGetVolumen() {
		assertEquals(cilindro.getVolumen(),20*Math.PI);
	}
	
	@Test 
	void testGetSuperficie() {
		assertEquals(cilindro.getSuperficie(),24*Math.PI);
	}
	
	@Test
	void testGetMaterial() {
		assertEquals(cilindro.getMaterial(),"Madera");
	}
	
	@Test
	void testGetColor() {
		assertEquals(cilindro.getColor(),"Naranja");
	}
}
