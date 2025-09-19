package ar.edu.unlp.info.oo1.ejercicio07;

public class Cuerpo3D {

	//variables
	private Figuraa caraBasal;
	private double altura;
	
	//constructor
	public Cuerpo3D(Figuraa figura1, double altura ) {
		this.caraBasal=figura1;
		this.altura=altura;
	}			
	public Cuerpo3D() {}
	//metodos
	public void setAltura(double altura){
		this.altura=altura;
	}
	
	public double getAltura(){
		return this.altura;
	}
	
	public void setCaraBasal(Figuraa figura){
		this.caraBasal=figura;
	}
	
	public double getVolumen(){
		return this.altura*caraBasal.getArea();
	}
	
	public double getSuperficieExterior(){
		return 2*caraBasal.getArea()+caraBasal.getPerimetro()*this.altura;
	}
}
