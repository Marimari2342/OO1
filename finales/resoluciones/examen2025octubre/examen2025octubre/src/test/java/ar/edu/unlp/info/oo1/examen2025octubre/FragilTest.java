package ar.edu.unlp.info.oo1.examen2025octubre;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FragilTest {

	Fragil fragil;
	Fragil fragilEspecial;
	
	@Test
	void test() {
		this.fragil = new Fragil("muñeca", false);
		this.fragilEspecial = new Fragil("copas", true);
		//testeo costo
		assertEquals(this.fragil.costo(),500);
		assertEquals(this.fragilEspecial.costo(),700);
		//testeo resumen
		assertEquals(this.fragil.resumen(),"Producto fragil, tipo: muñeca.");
		assertEquals(this.fragilEspecial.resumen(),"Producto fragil, tipo: copas, requiere embalaje especial.");
	}

}
