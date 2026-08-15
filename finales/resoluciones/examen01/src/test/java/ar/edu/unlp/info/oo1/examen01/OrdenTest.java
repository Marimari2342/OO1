package ar.edu.unlp.info.oo1.examen01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OrdenTest {

	Orden orden;
	Orden orden2;
	Orden orden3;
	Inspeccion inspeccion;
	Reparacion reparacion;
	Reemplazo reemplazo;
	
	@Test
	void test() {
		// punto 3 --> instancio todo el ejemplo (solo el objeto orden y los trabajos que guardo ahí)
		orden = new Orden("Mantenimiento Torre Norte");
		orden2 = new Orden("Orden 2");
		orden3 = new Orden("Torre Sur");
		inspeccion = new Inspeccion("Laura Mendez", 2,"sala de maquinas",true);
		reparacion = new Reparacion("Martin Suarez", 5, "ascensor principal", 4500);
		reemplazo = new Reemplazo("luminarias", "cochera", 8, 1200);
		orden.agregarTrabajo(inspeccion);
		orden.agregarTrabajo(reparacion);
		orden.agregarTrabajo(reemplazo);
		orden3.agregarTrabajo(inspeccion);
		System.out.println(orden.descripcionOrden());
		//punto 4 --> testeo costo
		assertEquals(orden.costoTotal(),9000+8*1200+5*4500);
		assertEquals(orden2.costoTotal(),0);
		//punto 4 --> testeo descripcion
		assertEquals(orden3.descripcionOrden(),"Orden \"Torre Sur\"\n1. Inspeccion de sala de maquinas por Laura Mendez (urgente, 2 horas).");
	}

}
