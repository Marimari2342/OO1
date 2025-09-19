package ar.edu.unlp.info.oo1.ejercicio07;

public class Circulo implements Figuraa{

	//variables
	private double radio;
		
	//constructor
	public Circulo(double radio) {
		this.radio=radio;
	}
	public Circulo() {}
		
	//metodos
	public double getDiametro() {
		return this.radio*2;
	}
	
	public double getRadio() {
		return this.radio;
	}
	
	public void setDiametro(double diam) {
		this.radio=diam/2;
	}
	
	public void setRadio(double radio) {
		this.radio=radio;
	}
	
	public double getPerimetro() {
		return this.radio*Math.PI*2;
	}
	
	public double getArea() {
		return Math.pow(this.radio,2)*Math.PI;
	}
}
