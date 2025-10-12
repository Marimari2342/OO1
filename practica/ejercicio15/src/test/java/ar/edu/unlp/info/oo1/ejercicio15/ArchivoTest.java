package ar.edu.unlp.info.oo1.ejercicio15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArchivoTest {
	private Archivo archivo;
	@BeforeEach
	void setUp() throws Exception {
		this.archivo = new Archivo("foto01");
	}

	@Test
	void testGetNombre() {
		assertEquals(this.archivo.getNombre(),"foto01");
	}

	@Test
	void testTamanio() {
		assertEquals(this.archivo.tamanio(),6);
	}
}
