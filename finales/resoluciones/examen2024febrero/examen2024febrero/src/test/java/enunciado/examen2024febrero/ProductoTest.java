package enunciado.examen2024febrero;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductoTest {
	
	Producto producto;
	
	@Test
	void test() {
		//1 caso --> un producto con determinado costo, valorDeEnvioPorKilo y peso
		//solo testeo el metodo costo()
		producto = new Producto(500,30,1,"Martillo");
		assertEquals(this.producto.costo(),530);
	}

}
