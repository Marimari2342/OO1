package enunciado.examen2024febrero;

import java.util.List;
import java.util.LinkedList;

public class Pedido {

	//variables de instancia
	private List<Item> items;
	
	//constructor
	public Pedido() {
		this.items = new LinkedList<Item>();
	}
	
	//metodos
	public void agregarItem(Item item) {
		this.items.add(item);
	}
	
	public double costoTotal() {
		return this.items.stream().mapToDouble(item -> item.costo()).sum();
	}
}
