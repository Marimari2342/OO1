package ar.edu.unlp.info.oo1.ejercicio24;

public class Producto {

	//variables de instancia
	private String nombre;
	private String tipoMaterial;
	private double costo;
	private boolean esBiodegradable;
	
	//constructor
	public Producto(String nombre, String material, double costo, boolean biodeg) {
		this.nombre = nombre;
		this.tipoMaterial = material;
		this.costo = costo;
		this.esBiodegradable = biodeg;
	}
	
	//metodos
	public double calcularCosto() {
		return this.costo;
	}
}
