package ar.edu.unlp.info.oo1.ejercicio29;

public class ReproduccionVideo extends Actividad {

	//variables de instancia
	private double duracionTotal;
	private double duracionPublicidad;
	
	//constructor
	public ReproduccionVideo(String direccionIP, double durTot, double durPub) {
		super(direccionIP);
		this.duracionTotal = durTot;
		this.duracionPublicidad = durPub;
	}
	
	//metodos
	public double duracionReal() {
		return this.duracionTotal - this.duracionPublicidad;
	}
	
	public double montoActividad() {
		return 10*this.duracionReal();
	}
}
