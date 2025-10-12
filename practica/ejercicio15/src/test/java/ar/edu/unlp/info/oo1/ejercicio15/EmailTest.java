package ar.edu.unlp.info.oo1.ejercicio15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmailTest {
	private Email email;
	private Archivo archivo;
	
	@BeforeEach
	void setUp() throws Exception {
		this.archivo = new Archivo("foto01");
		this.email = new Email("bienvenida","le damos la bienvenida a la materia OO1");
		this.email.agregarArchivo(archivo);
	}

	@Test
	void testGetTitulo() {
		assertEquals(email.getTitulo(),"bienvenida");
	}
	
	@Test
	void testGetCuerpo() {
		assertEquals(email.getCuerpo(),"le damos la bienvenida a la materia OO1");
	}
	
	@Test
	void testTamanioEmail() {
		int esperado = "bienvenida".length()+"le damos la bienvenida a la materia OO1".length()+"foto01".length();
		assertEquals(this.email.tamanioEmail(),esperado);
	}
	
	@Test
	void testBuscarTexto() {
		assertTrue(this.email.buscarTexto("bienvenida"));
		assertTrue(this.email.buscarTexto("OO1"));
		assertFalse(this.email.buscarTexto("CADP"));
	}
}
