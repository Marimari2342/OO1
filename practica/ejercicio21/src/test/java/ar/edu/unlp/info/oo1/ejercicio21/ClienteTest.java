package ar.edu.unlp.info.oo1.ejercicio21;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ar.edu.unlp.info.oo1.ejercicio17.DateLapse;

class ClienteTest {

	private Cliente corpo;
	private Cliente persona;
	
	@BeforeEach
	void setUp() throws Exception {
		this.corpo = new ClienteCorporativo("Corporacion Capsula", "Calle falsa 123", "1234");
		this.persona = new PersonaFisica("Juana", "47 n° 972", "30200456");
	}

	@Test
	void testMontoAPagar() {
		Envio envio1 = new EnvioInternacional("Argentina","Francia",3200,true);
		Envio envio2 = new EnvioInterurbano("Buenos Aires","Cordoba",4500,330);
		Envio envio3 = new EnvioLocal("La Plata","Villa Elisa",2.5,false);
		this.corpo.agregarEnvio(envio1);
		this.persona.agregarEnvio(envio2);
		this.persona.agregarEnvio(envio3);
		DateLapse periodo1 = new DateLapse(LocalDate.of(2025, 10, 25),7);
		DateLapse periodo2 = new DateLapse(LocalDate.of(2025, 9, 25),7);
		assertEquals(this.corpo.montoPagar(periodo1),44200);
		assertEquals(this.corpo.montoPagar(periodo2),0);
		assertEquals(this.persona.montoPagar(periodo1),102150);
	}
}
