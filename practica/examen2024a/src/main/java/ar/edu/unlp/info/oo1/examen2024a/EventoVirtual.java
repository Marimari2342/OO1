package ar.edu.unlp.info.oo1.examen2024a;

import java.time.LocalDate;

public class EventoVirtual extends Evento{
	
	//variables de instancia
	private double precioEnvioRemera;
	
	//constructor
	public EventoVirtual(String nombre, LocalDate fecha, String tema, double precioI, double precioR, double envio) {
		super(nombre, fecha, tema, precioI, precioR);
		this.precioEnvioRemera = envio;
	}
	
	//metodos
	public double precioAsistencia(LocalDate fecha) {
		double precio = this.calcularPrecioInscripcionRemera()+this.precioEnvioRemera;
		return (this.mismaFecha(fecha)) ? precio*20 : precio;
	}
}
