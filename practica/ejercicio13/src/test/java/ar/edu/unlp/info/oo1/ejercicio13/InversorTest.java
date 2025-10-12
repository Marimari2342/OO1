package ar.edu.unlp.info.oo1.ejercicio13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InversorTest {

	private Inversor inversor;
	private Inversion inv1;
	private Inversion inv2;
	private Inversion inv3;
	
	@BeforeEach
	void setUp() throws Exception {
		this.inversor = new Inversor(); 
		this.inv1 = new Accion("Inmuebles",10,2000);
		this.inv2 = new Accion("Farmacia",15,3000);
		this.inv3 = new PlazoFijo(15000,0.5);
		this.inversor.agregarInversion(inv1);
		this.inversor.agregarInversion(inv2);
		this.inversor.agregarInversion(inv3);
	}

	@Test
	void testValorInversionActual() {
		double esperado = this.inv1.calcularValor()+this.inv2.calcularValor()+this.inv3.calcularValor();
		assertEquals(this.inversor.valorInversionActual(),esperado);
	}

}
