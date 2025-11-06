package ar.edu.unlp.info.oo1.ejercicio29;

public class Item {
	
	//variables de instancia
	private String nombre;
	private int cantidad;
	private double precioUnitario;
	
	//constructor
	public Item(String nombre, int cant, double precio) {
		this.nombre = nombre;
		this.cantidad = cant;
		this.precioUnitario = precio;
	}
	
	//metodos
	public double precioItem() {
		return this.cantidad*this.precioUnitario;
	}

}
