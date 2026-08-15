package ar.edu.unlp.info.oo1.examen2025octubre;

public class Documento implements Contenido{

	//variables de instancia
	private int cantHojas;
	private boolean confidencial;
	
	//constructor
	public Documento(int cantHojas, boolean confidencial) {
		this.cantHojas = cantHojas;
		this.confidencial = confidencial;
	}
	
	//metodos
	public double costo() {
		return this.confidencial ? 400 : 300;
	}
	
	public String resumen() {
		return "Documento de "+this.cantHojas+" hojas"+(this.confidencial ? ", confidencial.": ".");
	}
}
