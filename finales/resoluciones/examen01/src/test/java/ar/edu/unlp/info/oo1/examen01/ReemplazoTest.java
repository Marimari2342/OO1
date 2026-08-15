package ar.edu.unlp.info.oo1.examen01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReemplazoTest {

	Reemplazo reemplazo;
	
	@Test
	void test() {
		//punto 4 --> testeo de costo y descripcion
		reemplazo = new Reemplazo("luminarias", "cochera", 8, 1200);
		assertEquals(reemplazo.costo(),9600);
		assertEquals(reemplazo.descripcion(),"Reemplazo de 8 luminarias en cochera ($1200.0 cada uno).");
	}

}
