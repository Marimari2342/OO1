package ar.edu.unlp.info.oo1.ejercicio19;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo1.ejercicio17.DateLapse;

class UsuarioTest {
	private Usuario usuario;
	
	@BeforeEach
	void setUp() throws Exception {
		this.usuario = new Usuario("Eleonora","13 y 57","40253456");
	}

	@Test
	void CalcularIngresos() {
		Cancelacion c1 = new CancelacionFlexible(); 
		Cancelacion c2 = new CancelacionEstricta(); 
		Propiedad prop1 = new Propiedad("13 y 50","Depto 5B", 2000,c1);
		Propiedad prop2 = new Propiedad("14 y 47","Depto 8A", 3000,c2);
		prop1.crearReserva(new DateLapse(LocalDate.of(2025, 12, 1),7));
		prop2.crearReserva(new DateLapse(LocalDate.of(2025, 11, 1),8));
		prop2.crearReserva(new DateLapse(LocalDate.of(2026, 1, 15),7));
		this.usuario.agregarPropiedad(prop1);
		this.usuario.agregarPropiedad(prop2);
		double esp1 = 7*prop1.getPrecio()+8*prop2.getPrecio();
		double esp2 = 7*prop2.getPrecio();
		assertEquals(this.usuario.calcularIngresos(new DateLapse(LocalDate.of(2025, 10, 20),60)),esp1*0.75);
		assertEquals(this.usuario.calcularIngresos(new DateLapse(LocalDate.of(2026, 1, 10),30)),esp2*0.75);	
		assertEquals(this.usuario.calcularIngresos(new DateLapse(LocalDate.of(2023, 10, 10),30)),0);	
	}
}
