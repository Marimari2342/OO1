package ar.edu.unlp.info.oo1.ejercicio13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AccionTest {

	private Accion accion;
	
	@BeforeEach
	void setUp() throws Exception {
		this.accion = new Accion("Inmuebles",10,2000);
	}

	@Test
	void testCalcularValor() {
		double esperado = 2000*10;
		assertEquals(this.accion.calcularValor(),esperado);
	}

}
