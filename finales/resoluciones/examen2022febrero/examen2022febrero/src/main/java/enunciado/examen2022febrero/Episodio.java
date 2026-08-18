package enunciado.examen2022febrero;

public class Episodio {
	
	//variables de instancia
	private double duracionMinutos;
	private int cantEscuchas;
	
	//constructor
	public Episodio(double duracion, int cantEscuchas) {
		this.duracionMinutos = duracion;
		this.cantEscuchas = cantEscuchas;
	}
	
	//metodos
	public double puntaje() {
		return this.duracionMinutos*this.cantEscuchas;
	}
	
	public int cantEscuchas() {
		return this.cantEscuchas;
	}
	
	public double duracion() {
		return this.duracionMinutos;
	}
}
