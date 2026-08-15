package ar.edu.unlp.info.oo1.examen01;

public class Reemplazo implements Trabajo {
	
	//variables de instancia
	private String nombreComponente;
	private String sector;
	private int cantComponentes;
	private double precioUnidad;
	
	//constructor
	public Reemplazo(String nombre, String sector, int cant, double precio) {
		this.nombreComponente = nombre;
		this.sector = sector;
		this.cantComponentes = cant;
		this.precioUnidad = precio;
	}
	
	//metodos
	public String descripcion() {
		return "Reemplazo de "+this.cantComponentes+" "+this.nombreComponente
				+" en "+this.sector+" ($"+this.precioUnidad+" cada uno).";
	}
	
	public double costo() {
		return this.cantComponentes*this.precioUnidad;
	}
}
