package ar.edu.unlp.info.oo1.ejercicio03;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Presupuesto {
	
	//variables
	private LocalDate fecha;
	private String cliente;
	private List<Item> items;
	
	//constructor
	public Presupuesto(String cliente) {
		this.fecha = LocalDate.now();
		this.cliente = cliente;
		this.items = new ArrayList<Item>();
	}
	
	//getters y setters
	public String getCliente() {
		return this.cliente;
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	//metodos
	public void agregarItem (Item item) {
		this.items.add(item);
	}
	
	public double calcularTotal() {
		double total=0;
		for (Item item : this.items) { //for each
			total += item.costo();
		}
		return total;
		//return this.items.stream().mapToDouble(Item::costo).sum(); //stream
	}
		
}
