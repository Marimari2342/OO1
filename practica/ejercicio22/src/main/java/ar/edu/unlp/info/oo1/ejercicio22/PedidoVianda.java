package ar.edu.unlp.info.oo1.ejercicio22;

import java.util.LinkedList;

public class PedidoVianda extends Pedido{

	//variables de instancia
	private boolean celiaco;
	private LinkedList<Vianda> lista;
		
	//constructor
	public PedidoVianda(String email, Envio entrega, boolean celiaco) {
		super(email, entrega);
		this.lista = new LinkedList<>();
	}
	
	//metodos
	public double calcularCostoPedido() {
		return this.lista.stream()
				.mapToDouble(vianda -> vianda.getPrecio()).sum();
	}
	
	
	public void agregarProducto(Vianda producto) {
		if ((this.celiaco && producto.aptaCeliaco()) || (!this.celiaco)) {
			if (this.calcularTiempoEntrega()<40) {
				lista.add(producto);
			}	
		}
	}
}
