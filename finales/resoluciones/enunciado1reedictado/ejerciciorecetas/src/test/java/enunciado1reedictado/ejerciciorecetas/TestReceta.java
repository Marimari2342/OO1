package enunciado1reedictado.ejerciciorecetas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestReceta {
	
	Receta receta;
	Base base;
	Condimento condimento;
	Proteina proteina;
	
	@Test
	void test() {
		receta = new Receta("Bowl tibio de pollo");
		base = new Base("arroz", 2, true);
		condimento = new Condimento("mix provenzal", 3, false);
		proteina = new Proteina("pollo", "cubos", 2, 2200);
		receta.agregarComponente(base);
		receta.agregarComponente(condimento);
		receta.agregarComponente(proteina);
		
		//testeo descripcion
		System.out.println(receta.descripcionReceta());
		assertEquals(receta.descripcionReceta(),"Receta \"Bowl tibio de pollo\"\n1. Base de arroz (integral, "
				+ "2 porciones)\n2. Condimento mix provenzal (no picante, 3 cucharaditas)\n3. Proteína de pollo "
				+ "en cubos (2 a $2200.0 por porción)");
		//tecteo costo
		assertEquals(receta.costoReceta(),6600);
	}

}
