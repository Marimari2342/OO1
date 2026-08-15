package enunciado.examen2024febrero;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PedidoTest {

	Pedido pedido;
	Pedido pedidoVacio;
	Producto producto;
	Servicio servicio;
	
	@Test
	void test() {
		//2 casos --> uno de un pedido vacio y otro con 1 o más items en el pedido
		producto = new Producto(500,30,1,"Martillo");
		servicio = new Servicio(5,100,"Configurar red Wi-Fi");
		pedido = new Pedido();
		pedido.agregarItem(producto);
		pedido.agregarItem(servicio);
		assertEquals(this.pedido.costoTotal(),1030);
		pedidoVacio = new Pedido();
		assertEquals(this.pedidoVacio.costoTotal(),0);
	
	}

}
