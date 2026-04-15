package ar.edu.unlp.info.oo1.ejercicio23;
import java.util.LinkedList;

public class Vehiculo {

	//variables de instancia
	private String descripcion;
	private int capacidad;
	private int anioFabricacion;
	private double precioMercado;
	private LinkedList<Viaje> viajes;
	private Conductor conductor;
	
	//constructor
	public Vehiculo(String descripcion, int capacidad, int anio, double precio, Conductor conductor) {
		this.descripcion = descripcion;
		this.capacidad = capacidad;
		this.anioFabricacion = anio;
		this.precioMercado = precio;
		this.conductor = conductor;
		this.viajes = new LinkedList<>();
	}
	
	//metodo
	public void agregarViaje(Viaje viaje) {
		this.viajes.add(viaje);
	}
	
	public boolean hayLugar(int pasajeros) {
		return this.capacidad-(pasajeros+1)>=0;
	}
	
	public void calcularMontoViaje(double gasto) {
		this.conductor.cobrarViajeConductor(-this.precioMercado*0.01);
	}
}
