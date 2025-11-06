package ar.edu.unlp.info.oo1.examen2024b;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EspecieTest {
	
	private Humano humano;
	private Orco orco;
	
	@BeforeEach
	void setUp() throws Exception {
		Rol rol1 = new Mago();
		Rol rol2 = new Guerrero();
		this.humano = new Humano("Turin", rol1);
		this.orco = new Orco("Gothmog", rol2);
	}

	@Test
	void test() {
		this.humano.enfrentamientoUnoAUno(orco, 22);
		this.humano.cambiarRol(new Guerrero());
		this.humano.enfrentamientoUnoAUno(orco, 14);
	}

}
