package enunciado1reedictado.ejerciciorecetas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCondimento {

	Condimento picante;
	Condimento noPicante;
	
	@Test
	void test() {
		noPicante = new Condimento("mix provenzal", 3, false);
		picante = new Condimento("pimienta",1,true);
		
		//test costo
		assertEquals(this.noPicante.costo(),0);
		assertEquals(this.picante.costo(),0);
		//test descripcion
		assertEquals(this.noPicante.descripcion(),"Condimento mix provenzal (no picante, 3 cucharaditas)");
		assertEquals(this.picante.descripcion(),"Condimento pimienta (picante, 1 cucharaditas)");
	}

}
