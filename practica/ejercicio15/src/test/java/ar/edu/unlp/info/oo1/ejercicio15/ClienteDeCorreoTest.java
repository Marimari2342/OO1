package ar.edu.unlp.info.oo1.ejercicio15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteDeCorreoTest {

	private Carpeta carpeta1;
	private Email email1;
	private Email email2;
	private Email email3;
	private Archivo archivo;
	private ClienteDeCorreo cliente;
	
	@BeforeEach
	void setUp() throws Exception {
		this.archivo = new Archivo("foto01");
		this.email1 = new Email("bienvenida","le damos la bienvenida a la materia OO1");
		this.email1.agregarArchivo(archivo);
		this.email2 = new Email("hola","este es un segundo mail");
		this.email3 = new Email("chau","y este es el tercer y ultimo mail");
		this.carpeta1 = new Carpeta("entrada");
		this.carpeta1.recibirMail(email1);
		this.carpeta1.recibirMail(email2);
		this.cliente = new ClienteDeCorreo();
		this.cliente.agregarCarpeta(carpeta1);
		this.cliente.recibir(email3);
	}
	

	@Test
	void testBuscar() {
		assertSame(this.cliente.buscar("bienvenida"),email1);
		assertSame(this.cliente.buscar("marianela"),null);
	}
	
	@Test
	void testEspacioOcupado() {
		int esperado = this.email3.tamanioEmail()+this.carpeta1.tamanio();
		assertEquals(this.cliente.espacioOcupado(),esperado);
	}

}
