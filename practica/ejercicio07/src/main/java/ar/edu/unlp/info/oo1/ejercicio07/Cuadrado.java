package ar.edu.unlp.info.oo1.ejercicio07;

public class Cuadrado implements Figuraa{

	//variables
	private double lado;
	
	//constructor
	public Cuadrado(double lado) {
		this.lado=lado;
	}
	public Cuadrado() {}
	//metodos
	public double getLado() {
		return this.lado;
	}
	
	public void setLado(double lado) {
		this.lado=lado;
	}
	
	public double getPerimetro() {
		return this.lado*4;
	}
	
	public double getArea() {
		return Math.pow(this.lado,2);
	}
}
