package ar.edu.unlp.info.oo1.ejercicio15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarpetaTest {
	
	private Carpeta carpeta1;
	private Carpeta carpeta2;
	private Email email1;
	private Email email2;
	private Email email3;
	private Archivo archivo;
	
	@BeforeEach
	void setUp() throws Exception {
		this.archivo = new Archivo("foto01");
		this.email1 = new Email("bienvenida","le damos la bienvenida a la materia OO1");
		this.email1.agregarArchivo(archivo);
		this.email2 = new Email("hola","este es un segundo mail");
		this.email3 = new Email("chau","y este es el tercer y ultimo mail");
		this.carpeta1 = new Carpeta("entrada");
		this.carpeta2 = new Carpeta("leidos");
		this.carpeta1.recibirMail(email1);
		this.carpeta1.recibirMail(email2);
		this.carpeta1.recibirMail(email3);
	}

	@Test
	void testGetNombre() {
		assertEquals(this.carpeta1.getNombre(),"entrada");
	}
	
	@Test
	void testMover() {
		this.carpeta1.mover(email3, carpeta2);
	    assertFalse(this.carpeta1.getMails().contains(email3));
	    assertTrue(this.carpeta2.getMails().contains(email3));
	}
	
	@Test
	void testTamanioEmail() {
		this.carpeta1.mover(email3, carpeta2);
		int esperado = this.email1.tamanioEmail()+this.email2.tamanioEmail();
		assertEquals(this.carpeta1.tamanio(),esperado);
	}
	
	@Test
	void testBuscar() {
		assertSame(this.carpeta1.buscar("bienvenida"),email1);
		assertSame(this.carpeta1.buscar("chau"),email3);
		assertSame(this.carpeta1.buscar("CADP"),null);
	}
}
