package ar.edu.unlp.info.oo1.ejercicio24;

public class Tecnico {

	//variables de instancia
	private String nombre;
	private String especialidad;
	private double valorHora;
	
	//constructor
	public Tecnico(String nombre, String especialidad, double valor) {
		this.nombre = nombre;
		this.especialidad = especialidad;
		this.valorHora = valor;
	}
	
	//metodos
	public double calcularPrecio(int horas) {
		return this.valorHora*horas;
	}
}
