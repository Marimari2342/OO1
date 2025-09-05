package ar.edu.unlp.info.oo1.ejercicio02;

public class Producto {

	//variables de instancia
	private double peso;
	private double precioPorKilo;
	private String descripcion;
	
	//constructor
	public Producto(String descr, double peso, double precioK) {
		this.peso=peso;
		this.precioPorKilo=precioK;
		this.descripcion=descr;
	}
	
	//getters y setters
	public double getPeso() {
		return this.peso;
	}
	
	public double getPrecioPorKilo() {
		return this.precioPorKilo;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
	
	public void setPeso(double peso) {
		this.peso=peso;
	}
	
	public void setPrecioPorKilo(double precioK) {
		this.precioPorKilo=precioK;
	}
	
	public void setDescripcion(String descr) {
		this.descripcion=descr;
	}
	
	//metodos pedidos
	public double getPrecio() {
		return this.peso*this.precioPorKilo;
	}
}