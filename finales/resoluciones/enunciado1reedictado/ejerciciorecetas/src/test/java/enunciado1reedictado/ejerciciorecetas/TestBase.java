package enunciado1reedictado.ejerciciorecetas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestBase {

	Base base1;
	Base base2;
	
	@Test
	void test() {
		base1 = new Base("arroz", 2, true);
		base2 = new Base("avena", 3, false);
		
		//test costo
		assertEquals(base1.costo(),2200);
		assertEquals(base2.costo(),1500);
		//test descripcion
		assertEquals(base1.descripcion(),"Base de arroz (integral, 2 porciones)");
		assertEquals(base2.descripcion(),"Base de avena (3 porciones)");
	}

}
