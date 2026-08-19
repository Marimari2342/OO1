package enunciado.examen2023noviembre;

import java.util.List;
import java.util.LinkedList;

public class PedidoItem {
	
	//variables de instancia
	private List<Servicio> servicios;
	private int cantidad;
	
	//constructor
	public PedidoItem(int cant) {
		this.servicios = new LinkedList<Servicio>();
		this.cantidad = cant;
	}
	
	//metodos
	public double cotizarItem() {
		return this.servicios.stream().mapToDouble(servicio -> servicio.cotizar(this.cantidad)).sum();
	}
}
