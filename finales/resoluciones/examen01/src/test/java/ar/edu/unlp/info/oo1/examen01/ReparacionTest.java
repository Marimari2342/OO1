package ar.edu.unlp.info.oo1.examen01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReparacionTest {

	Reparacion reparacion;
	
	@Test
	void test() {
		reparacion = new Reparacion("Martin Suarez", 5, "ascensor principal", 4500);
		//punto 4 --> testeo costo y descripcion 
		assertEquals(reparacion.costo(),22500);
		assertEquals(reparacion.descripcion(),"Reparacion de ascensor principal por Martin Suarez (5 horas a $4500.0 por hora).");
	}

}
