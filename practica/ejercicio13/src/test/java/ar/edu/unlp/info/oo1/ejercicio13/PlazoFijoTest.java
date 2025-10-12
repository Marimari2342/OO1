package ar.edu.unlp.info.oo1.ejercicio13;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlazoFijoTest {

	private PlazoFijo plazo;
	
	@BeforeEach
	void setUp() throws Exception {
		this.plazo = new PlazoFijo(15000,0.5);
	}

	@Test
	void testCalcularValor() {
		double esperado = 15000+0.5*0;
		assertEquals(this.plazo.calcularValor(),esperado);
		this.plazo.setFecha(LocalDate.of(2025, 10, 1));
		double esperado2 = 15000+0.5*ChronoUnit.DAYS.between(LocalDate.now(),LocalDate.of(2025, 10, 1));
		assertEquals(this.plazo.calcularValor(),esperado2);
	}

}
