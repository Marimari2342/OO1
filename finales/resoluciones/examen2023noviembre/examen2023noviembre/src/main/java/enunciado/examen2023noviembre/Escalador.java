package enunciado.examen2023noviembre;

import java.util.List;
import java.util.LinkedList;

public abstract class Escalador {
	
	//variables de instancia
	protected List<Pedido> historialPedidos;
	private String nombre;
	
	//constructor
	public Escalador (String nombre) {
		this.nombre = nombre;
		this.historialPedidos = new LinkedList<Pedido>();
	}
	
	//metodos
	public void agregarPedido(Pedido pedido) {
		this.historialPedidos.add(pedido);
	}
	
	public abstract double descuentoHistorialPedido(Pedido actual);
}
