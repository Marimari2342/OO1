package enunciado.chatgptsolucion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccionTest {

	Accion accion;
	
	@Test
	void test() {
		this.accion = new Accion("Empresa X",3000,10);
		assertEquals(this.accion.valorInversion(),30000);
	}

}
