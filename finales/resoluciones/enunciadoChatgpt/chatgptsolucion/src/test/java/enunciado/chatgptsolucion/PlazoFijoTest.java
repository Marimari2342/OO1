package enunciado.chatgptsolucion;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.Test;

class PlazoFijoTest {

	PlazoFijo plazofijo1;
	PlazoFijo plazofijo2;
	
	@Test
	void test() {
		//caso 1 --> hace muchos dias que puse el plazo fijo
		this.plazofijo1 = new PlazoFijo(LocalDate.of(2026,7,15),20000,5);
		assertEquals(this.plazofijo1.valorInversion(),20000*(1 + 
				5*ChronoUnit.DAYS.between(LocalDate.of(2026,7,15),LocalDate.now())));
		//caso 2 --> plazo fijo sin días pasados
		this.plazofijo2 = new PlazoFijo(LocalDate.now(),20000,5);
		assertEquals(this.plazofijo2.valorInversion(),20000);
	}

}
