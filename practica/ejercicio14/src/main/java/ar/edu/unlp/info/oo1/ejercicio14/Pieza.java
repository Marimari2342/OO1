package ar.edu.unlp.info.oo1.ejercicio14;

public abstract class Pieza {
	//variables de instancia
	private String material;
	private String color;
	
	//constructor

	public Pieza(String material, String color) {
		this.material = material;
		this.color = color;
	}
	//metodos
	public String getMaterial() {
		return this.material;
	}
	public String getColor() {
		return this.color;
	}
	public abstract double getVolumen();
	public abstract double getSuperficie();
}
