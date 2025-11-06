package ar.edu.unlp.info.oo1.ejercicio19;

import java.util.LinkedList;

import ar.edu.unlp.info.oo1.ejercicio17.DateLapse;

public class Propiedad {

	//variables de instancia
	private String direccion;
	private String nombre;
	private double precio;
	private LinkedList<Reserva> reservas;
	private Cancelacion politicaCancelacion;
	
	//constructor
	public Propiedad(String dir, String nombre,double precio,Cancelacion cancelacion ) {
		this.direccion = dir;
		this.nombre = nombre;
		this.precio = precio;
		this.reservas = new LinkedList<>();
		this.politicaCancelacion = cancelacion;
	}
	
	//metodos
	public double getPrecio() {
		return this.precio;
	}
	
	public LinkedList<Reserva> getReservas(){
		return this.reservas;
	}
	
	public boolean consultarDisponibilidad(DateLapse periodo) {
		return this.reservas.stream()
				.noneMatch(reserva -> reserva.getPeriodo().overlaps(periodo));
	}
	
	public double cancelarReserva(Reserva reserva) {
		if (!reserva.enCurso()) {
			this.reservas.remove(reserva);
			return this.politicaCancelacion.calcularReembolso(reserva);
		}
		return 0;
	}
	
	public boolean crearReserva(DateLapse periodo) {
		if(this.consultarDisponibilidad(periodo)) {
			Reserva reserva = new Reserva(periodo,this.precio);
			this.reservas.add(reserva);
			return true;
		}else {
			return false;
		}
	}
	
	//esto esta bien????
	public double calcularIngresoPropiedad(DateLapse periodo) {
		return this.reservas.stream()
				.filter(reserva -> periodo.overlaps(reserva.getPeriodo()))
				.mapToDouble(reserva -> reserva.calcularPrecio())
				.sum();
	}
	
	public void setPoliticaCancelacion(Cancelacion cancelacion) {
		this.politicaCancelacion = cancelacion;
	}
}
