package ar.edu.unlp.info.oo1.ejercicio17;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DateLapseTest {
	
	private DateLapse lapso;

	@BeforeEach
	void setUp() throws Exception {
		this.lapso = new DateLapse(LocalDate.of(1993, 12, 8),2828);
	}

	@Test
	void testGetFrom() {
		LocalDate fromEsp = LocalDate.of(1993, 12, 8);
		assertEquals(this.lapso.getFrom(),fromEsp);
	}

	@Test
	void testGetTo() {
		LocalDate toEsp = LocalDate.of(2001, 9, 5);
		assertEquals(this.lapso.getTo(),toEsp);
	}
	
	@Test
	void testSizeDays() {
		long esperado = ChronoUnit.DAYS.between(this.lapso.getFrom(), this.lapso.getTo());
		assertEquals(this.lapso.sizeDays(),esperado);
	}
	
	@Test
	void testIncludesDate() {
		LocalDate fecha1 = LocalDate.of(1992, 10, 5);
		LocalDate fecha2 = LocalDate.of(1993, 12, 8);
		LocalDate fecha3 = LocalDate.of(1996, 8, 16);
		LocalDate fecha4 = LocalDate.of(2001, 9, 5);
		LocalDate fecha5 = LocalDate.now();
		assertFalse(this.lapso.includesDate(fecha1),"anterior al lapso");
		assertTrue(this.lapso.includesDate(fecha2),"borde lapso from");
		assertTrue(this.lapso.includesDate(fecha3),"dentro del lapso");
		assertTrue(this.lapso.includesDate(fecha4),"borde lapso to");
		assertFalse(this.lapso.includesDate(fecha5),"posterior al lapso");
	}
}
