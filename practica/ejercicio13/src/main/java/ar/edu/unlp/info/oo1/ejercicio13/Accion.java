package ar.edu.unlp.info.oo1.ejercicio13;

public class Accion implements Inversion{

	//variables de instancia
	private String nombre;
	private int cantidadAcciones;
	private double valorUnitario;
	
	//constructor
	public Accion(String nombre, int cant, double valor) {
		this.nombre = nombre;
		this.cantidadAcciones = cant;
		this.valorUnitario = valor;
	}
	
	//metodos
	public double calcularValor() {
		return this.valorUnitario*this.cantidadAcciones;
	}
	
	public String getNombre() {
		return this.nombre;
	}
}
