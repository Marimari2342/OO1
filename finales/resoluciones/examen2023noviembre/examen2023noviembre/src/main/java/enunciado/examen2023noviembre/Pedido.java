package enunciado.examen2023noviembre;

import java.util.List;
import java.util.LinkedList;

public class Pedido {

	//variables de instancia
	private List<PedidoItem> items;
	
	//constructor
	public Pedido() {
		this.items = new LinkedList<PedidoItem>();
	}
	
	//metodos
	public double cotizar() {
		return this.items.stream().mapToDouble(item -> item.cotizarItem()).sum();
	}
	
	public double cotizarPedido(Escalador escalador) {
	    return this.cotizar() * (1 - escalador.descuentoHistorialPedido(this));
	}
}
