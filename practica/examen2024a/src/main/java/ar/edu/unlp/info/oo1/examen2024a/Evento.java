package ar.edu.unlp.info.oo1.examen2024a;
import java.time.LocalDate;
import java.time.Period;

public abstract class Evento {

	//variables de instancia
	private String nombre;
	private LocalDate fecha;
	private String tema;
	private double precioInscripcion;
	private double precioRemera;
	
	//constructor
	public Evento(String nombre, LocalDate fecha, String tema, double precioI, double precioR) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.tema = tema;
		this.precioInscripcion = precioI;
		this.precioRemera = precioR;
	}
	//metodos
	public abstract double precioAsistencia(LocalDate fecha);
	
	public double calcularPrecioInscripcionRemera() {
		return this.precioInscripcion+this.precioRemera;
	}
	
	public boolean mismaFecha(LocalDate fecha) {
		return this.fecha.equals(fecha);
	}
	
	public int calcularDias(LocalDate fechaEntrada) {
		return Period.between(fechaEntrada,this.fecha).getDays();
	}
	
}
