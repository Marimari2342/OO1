package enunciado.examen2024febrero;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ServicioTest {

	Servicio servicio;
	
	@Test
	void test() {
		//1 caso --> minimo 1 hora de trabajo y siempre hay un valor por hora
		//solo testeo el metodo costo()
		this.servicio = new Servicio(5,100,"Configurar red Wi-Fi");
		assertEquals(this.servicio.costo(),500);
	}

}
