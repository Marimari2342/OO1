package ar.edu.unlp.info.oo1.ejercicio19;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo1.ejercicio17.DateLapse;

class PropiedadTest {
	private Propiedad propiedad;
	
	@BeforeEach
	void setUp() throws Exception {
		Cancelacion c1 = new CancelacionFlexible(); 
		this.propiedad = new Propiedad("13 y 50","Depto 5B", 2000,c1);
	}

	@Test
	void testCrearReserva() {
		assertTrue(this.propiedad.crearReserva(new DateLapse(LocalDate.of(2025, 12, 1),7)));
		assertTrue(this.propiedad.crearReserva(new DateLapse(LocalDate.of(2025, 11, 5),15)));
		assertFalse(this.propiedad.crearReserva(new DateLapse(LocalDate.of(2025, 12, 5),10)));
	}
	
	@Test 
	void testConsultarDisponibilidad() {
		this.propiedad.crearReserva(new DateLapse(LocalDate.of(2025, 12, 1),7));
		assertFalse(this.propiedad.consultarDisponibilidad(new DateLapse(LocalDate.of(2025, 12, 5),7)));
		assertFalse(this.propiedad.consultarDisponibilidad(new DateLapse(LocalDate.of(2025, 12, 2),2)));
		assertTrue(this.propiedad.consultarDisponibilidad(new DateLapse(LocalDate.of(2025, 11, 5),7)));
	}
	
	@Test
	void testCalcularGanancia() {
		this.propiedad.crearReserva(new DateLapse(LocalDate.of(2025, 12, 1),7));//1 al 8 de diciembre
		this.propiedad.crearReserva(new DateLapse(LocalDate.of(2025, 11, 1),8));//1 al 9 de noviembre
		this.propiedad.crearReserva(new DateLapse(LocalDate.of(2026, 1, 15),7));//15 al 23 de enero
		assertEquals(this.propiedad.calcularIngresoPropiedad(new DateLapse(LocalDate.of(2025, 10, 20),60)),(7+8)*this.propiedad.getPrecio());
	}
	
	@Test
	void testCancelarReserva() {
		this.propiedad.crearReserva(new DateLapse(LocalDate.of(2026, 1, 15),7));//15 al 23 de enero
		Reserva r1 = this.propiedad.getReservas().getLast();
		assertEquals(this.propiedad.cancelarReserva(r1), 14000); // flexible 14000
		this.propiedad.setPoliticaCancelacion(new CancelacionModerada());
		this.propiedad.crearReserva(new DateLapse(LocalDate.of(2025, 10, 29),7));//en 2 dias
		Reserva r2 = this.propiedad.getReservas().getLast();
		assertEquals(this.propiedad.cancelarReserva(r2), 7000); // moderada 7000
		this.propiedad.crearReserva(new DateLapse(LocalDate.of(2025, 12, 1),8));//en mas de una semana 
		Reserva r3 = this.propiedad.getReservas().getLast();
		assertEquals(this.propiedad.cancelarReserva(r3), 16000); // moderada 16000
		this.propiedad.setPoliticaCancelacion(new CancelacionEstricta());
		this.propiedad.crearReserva(new DateLapse(LocalDate.of(2025, 12, 27),7));//en varios dias
		Reserva r4 = this.propiedad.getReservas().getLast();
		assertEquals(this.propiedad.cancelarReserva(r4), 0); // estricta 0
	}

}
