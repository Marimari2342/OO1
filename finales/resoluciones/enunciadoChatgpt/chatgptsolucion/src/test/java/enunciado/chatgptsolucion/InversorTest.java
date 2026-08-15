package enunciado.chatgptsolucion;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.Test;

class InversorTest {

	Inversor inversor1;
	Inversor inversor2;
	Inversor inversor3;
	PlazoFijo plazofijo;
	Accion accion;
	
	@Test
	void test() {
		//inversion 1 --> Persona sin inversiones
		this.inversor1 = new Inversor("Juana Perez");
		assertEquals(this.inversor1.valorActual(),0);
		//inversion 2 --> Persona con una sola inversion
		this.inversor2 = new Inversor("Matias Gomez");
		this.plazofijo = new PlazoFijo(LocalDate.of(2026,7,15),20000,5);
		this.inversor2.agregarInversion(plazofijo);
		assertEquals(this.inversor2.valorActual(),20000*(1 + 
				5*ChronoUnit.DAYS.between(LocalDate.of(2026,7,15),LocalDate.now())));
		//inversion 3 --> Persona con mas de una inversion
		this.inversor3 = new Inversor("Laura Martinez");
		this.accion = new Accion("Empresa X",1000,10);
		this.inversor3.agregarInversion(accion);
		this.inversor3.agregarInversion(plazofijo);
		assertEquals(this.inversor3.valorActual(),10000+20000*(1 + 
				5*ChronoUnit.DAYS.between(LocalDate.of(2026,7,15),LocalDate.now())));
	}

}
