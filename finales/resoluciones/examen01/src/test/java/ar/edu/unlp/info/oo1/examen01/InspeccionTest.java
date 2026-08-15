package ar.edu.unlp.info.oo1.examen01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InspeccionTest {

	Inspeccion inspeccion;
	Inspeccion inspeccionUrgente;
	
	@Test
	void test() {
		inspeccion = new Inspeccion("David Gomez", 3,"entrada",false);
		inspeccionUrgente = new Inspeccion("Laura Mendez", 2,"sala de maquinas",true);
		//punto 4 --> testeo de costo y descripcion
		assertEquals(inspeccion.costo(),6000);
		assertEquals(inspeccionUrgente.costo(),9000);
		assertEquals(inspeccion.descripcion(),"Inspeccion de entrada por David Gomez (normal, 3 horas).");
	}

}
