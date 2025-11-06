package ar.edu.unlp.info.oo1.ejercicio22;

public abstract class Producto {

	//variables de instancia
	private String nombre;
	private double precio;
	
	//constructor
	public Producto (String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	//metodos
	public double getPrecio() {
		return this.precio;
	}
}
