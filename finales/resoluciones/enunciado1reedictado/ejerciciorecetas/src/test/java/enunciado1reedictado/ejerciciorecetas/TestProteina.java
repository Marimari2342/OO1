package enunciado1reedictado.ejerciciorecetas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestProteina {

	Proteina proteina;
	
	@Test
	void test() {
		proteina = new Proteina("pollo", "cubos", 2, 2200);
		
		//test costo
		assertEquals(this.proteina.costo(),4400);
		//test descripcion
		assertEquals(this.proteina.descripcion(),"Proteína de pollo en cubos (2 a $2200.0 por porción)");
	}

}
