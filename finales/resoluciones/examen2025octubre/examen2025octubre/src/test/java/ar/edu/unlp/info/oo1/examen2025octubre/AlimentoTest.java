package ar.edu.unlp.info.oo1.examen2025octubre;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class AlimentoTest {

	Alimento alimentoSinRef;
	Alimento alimentoRefrig;
	
	@Test
	void test() {
		this.alimentoSinRef = new Alimento(LocalDate.of(2027,10,15),false);
		this.alimentoRefrig = new Alimento(LocalDate.of(2027,5,15),true);
		//testeo costo
		assertEquals(this.alimentoRefrig.costo(),550);
		assertEquals(this.alimentoSinRef.costo(),400);
		//testeo resumen
		assertEquals(this.alimentoRefrig.resumen(),"Alimento con vencimiento: 2027-05-15, requiere refrigeracion.");
		assertEquals(this.alimentoSinRef.resumen(),"Alimento con vencimiento: 2027-10-15.");
	}

}
