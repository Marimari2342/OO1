package ar.edu.unlp.info.oo1.examen2024a;

public class Sede {

	//variables de instancia
	private String nombreLugar;
	private double precioEstadiaPorDia;
	private int cantidadDiasEstadia;
	
	//constructor
	public Sede(String nombre, double precio, int cantidad) {
		this.nombreLugar = nombre;
		this.precioEstadiaPorDia = precio;
		this.cantidadDiasEstadia = cantidad;
	}
	
	//metodos
	public double precioTotal() {
		return this.precioEstadiaPorDia*this.cantidadDiasEstadia;
	}
}
