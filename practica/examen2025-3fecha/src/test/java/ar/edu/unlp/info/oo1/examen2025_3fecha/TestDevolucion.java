package ar.edu.unlp.info.oo1.examen2025_3fecha;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestDevolucion {
	Entrada aurora,lor,pomme,paris,kalandra;
	PoliticaDevolucion uno,dos;
	
	@BeforeEach
	void setUp() throws Exception {
		uno = new SinDevolucion();
		dos = new DevolucionFlexible(5000);
		aurora = new Entrada(70000, LocalDate.of(2025, 10, 3), uno); //sin devolucion --> ya paso $0
		lor = new Entrada(60000, LocalDate.of(2026, 10, 3), uno); //sin devolucion --> no paso $0
		pomme = new Entrada(70000, LocalDate.of(2025, 10, 3), dos); //flexible --> ya paso $0
		paris = new Entrada(65000, LocalDate.of(2026, 10, 3), dos,LocalDate.of(2026, 4, 13)); //flexible --> menos 3 dias $70000
		kalandra = new Entrada(70000, LocalDate.of(2026, 10, 3), dos,LocalDate.of(2026, 4, 5)); //flexible --> mas 3 dias $35000
	}
	
    @Test
    public void testDevolucion() {
        assertEquals(aurora.calcularReembolso(),0);
        assertEquals(lor.calcularReembolso(),0);
        assertEquals(pomme.calcularReembolso(),0);
        assertEquals(paris.calcularReembolso(),70000);
        assertEquals(kalandra.calcularReembolso(),35000);
    }
}
