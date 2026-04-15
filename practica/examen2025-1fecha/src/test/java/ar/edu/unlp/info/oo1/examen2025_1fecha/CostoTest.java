package ar.edu.unlp.info.oo1.examen2025_1fecha;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CostoTest {

	Usuario juan;
	AlquilerAuto autouno,autodos;
	Estadia uno;
	
	@BeforeEach
	void setUp() throws Exception {
		juan = new Usuario("Juan Perez");
		autouno = new AlquilerAuto(LocalDate.of(2025, 5, 10), LocalDate.of(2025, 5, 15), 100, 10, 50, "Fiat");
		autodos = new AlquilerAuto(LocalDate.of(2026, 3, 10), LocalDate.of(2026, 3, 12), 80, 15.5, 70, "Ford");
		uno = new Estadia(LocalDate.of(2025, 5, 10), LocalDate.of(2025, 5, 15), 100, "Rio Negro",3);
	}
	
    @Test
    public void testCosto() {
		juan.agregarServicio(autouno);//5dias*100diario+10*50-->1000
		assertEquals(1000,autouno.calcularCostoServicio());
		juan.agregarServicio(autodos);//2dias*80diario+15.5*70-->1245
		assertEquals(1245,autodos.calcularCostoServicio());
        assertEquals(2245, juan.calcularCostoTotal());
        juan.agregarServicio(uno);//5dias*100diario*3personas-->1500
        assertEquals(1500,uno.calcularCostoServicio());
        assertEquals(3745, juan.calcularCostoTotal());
    } 
}
