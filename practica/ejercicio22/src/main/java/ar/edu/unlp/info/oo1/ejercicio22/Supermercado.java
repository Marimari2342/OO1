package ar.edu.unlp.info.oo1.ejercicio22;

public class Supermercado extends Producto {
	
	//variables de instancia
	private String categoria;
	private double pesoKg;
	private int stock;
	
	//constructor
	public Supermercado (String nombre, String categoria, double precio, double peso, int stock) {
		super(nombre,precio);
		this.categoria = categoria;
		this.pesoKg = peso;
		this.stock = stock;
	}
	
	//metodos	
	public double getPesoKg() {
		return this.pesoKg;
	}
}

