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
	
	@Test 
	void testCantidadMails() {
		assertEquals(this.carpeta1.cantidadMails(), 3);
		assertEquals(this.carpeta2.cantidadMails(), 0);
	}
	
	@Test 
	void testCantidadDeEmailsPorTamaño() {
		assertEquals(this.carpeta1.cantidadDeEmailsPorTamaño().occurrencesOf("Mediano"),0);
		assertEquals(this.carpeta1.cantidadDeEmailsPorTamaño().occurrencesOf("Grande"),0);
		Email emailMediano = new Email("hola a mi mail mediano","Hola, te envío este mensaje para confirmar la reunión de mañana. Por favor, avisame si necesitás que lleve los documentos impresos o si los vemos directamente desde la computadora. Saludos y miles de gracias por tu tiempo y colaboración. Desde ya, todo mi apoyo incondicional bla bla bla ");
		Email emailGrande = new Email("este es mi mail mas largo","Estimado equipo, les comparto un resumen detallado de las actividades realizadas durante el último trimestre. Se completaron todos los objetivos planificados y se avanzó en la implementación de nuevas herramientas de seguimiento. Adjunto el informe con los indicadores de desempeño, observaciones generales y propuestas de mejora para el próximo período. Les pido que revisen la información antes del viernes para coordinar la reunión de cierre y definir los pasos siguientes. Chau chau");
		System.out.println("Pequeño1: " + email1.tamanioEmail());
		System.out.println("Pequeño2: " + email2.tamanioEmail());
		System.out.println("Pequeño3: " + email3.tamanioEmail());
		System.out.println("Mediano: " + emailMediano.tamanioEmail());
		System.out.println("Grande: " + emailGrande.tamanioEmail());
		this.carpeta1.recibirMail(emailMediano);
		this.carpeta1.recibirMail(emailGrande);
		assertEquals(this.carpeta1.cantidadDeEmailsPorTamaño().occurrencesOf("Pequeño"),3);
		assertEquals(this.carpeta1.cantidadDeEmailsPorTamaño().occurrencesOf("Mediano"),1);
		assertEquals(this.carpeta1.cantidadDeEmailsPorTamaño().occurrencesOf("Grande"),1);
	}
}
