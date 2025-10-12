package ar.edu.unlp.info.oo1.ejercicio14;

public class PrismaRectangular extends Pieza{
	private double ladoMayor;
	private double ladoMenor;
	private double altura;
	
	//constructor
	public PrismaRectangular(String material, String color, double ladoMayor, double ladoMenor, double altura) {
		super(material,color);
		this.ladoMayor=ladoMayor;
		this.ladoMenor=ladoMenor;
		this.altura=altura;
	}
		
	//metodos
	public double getVolumen() {
		return this.ladoMayor*this.ladoMenor*this.altura;
	}
	public double getSuperficie() {
		return this.ladoMayor*this.ladoMenor+this.ladoMenor*this.altura+this.ladoMayor*this.altura;
	}

}
