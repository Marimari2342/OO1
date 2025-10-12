package ar.edu.unlp.info.oo1.ejercicio14;

public class Esfera extends Pieza{
	private double radio;
	
	//constructor
	public Esfera(String material, String color, double radio) {
		super(material,color);
		this.radio=radio;
	}
		
	//metodos
	public double getVolumen() {
		return (4.0/3.0)*Math.PI*Math.pow(this.radio,3);
	}
	public double getSuperficie() {
		return 4*Math.PI*Math.pow(radio, 2);
	}
}
