package ar.edu.unlp.info.oo1.ejercicio19;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ar.edu.unlp.info.oo1.ejercicio17.DateLapse;

class ReservaTest {

	private Reserva reserva1;
	private Reserva reserva2;
	
	@BeforeEach
	void setUp() throws Exception {
		DateLapse periodo1 = new DateLapse(LocalDate.of(2025, 12, 1),7);
		this.reserva1 = new Reserva(periodo1,1500);
		DateLapse periodo2 = new DateLapse(LocalDate.of(2025, 10, 20),15);
		this.reserva2 = new Reserva(periodo2,2000);
	}

	@Test
	void testCalcularPrecio() {
		double esperado = this.reserva1.getPeriodo().sizeDays()*1500;
		assertEquals(this.reserva1.calcularPrecio(),esperado);
	}
	
	@Test
	void testEnCurso() {
		assertFalse(this.reserva1.enCurso());
		assertTrue(this.reserva2.enCurso());
	}

}
