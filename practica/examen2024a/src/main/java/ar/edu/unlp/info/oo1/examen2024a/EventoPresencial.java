package ar.edu.unlp.info.oo1.examen2024a;

import java.util.LinkedList;
import java.time.LocalDate;

public class EventoPresencial extends Evento {

	//variables de instancia
	private LinkedList<Sede> sedes;
	
	//constructor
	public EventoPresencial(String nombre, LocalDate fecha, String tema, double precioI, double precioR,LinkedList<Sede> sedes) {
		super(nombre, fecha, tema, precioI, precioR);
		this.sedes = new LinkedList<>();
		this.sedes.addAll(sedes);
	}
	
	//metodos
	public double precioAsistencia(LocalDate fecha) {
		double precio = this.calcularPrecioInscripcionRemera() +
				this.sedes.stream().mapToDouble(sede -> sede.precioTotal()).sum(); 
		return (this.mismaFecha(fecha)) ? precio*20 : precio;
	}
	
	public void agregarSede(Sede sede) {
		this.sedes.add(sede);
	}
}
