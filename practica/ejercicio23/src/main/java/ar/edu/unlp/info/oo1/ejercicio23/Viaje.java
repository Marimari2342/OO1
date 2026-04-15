package ar.edu.unlp.info.oo1.ejercicio23;
import java.time.LocalDate;
import java.util.LinkedList;
import java.time.temporal.*;
import java.util.HashSet;

public class Viaje {
	
	//variables de instancia
	private double costoTotal;
	private String localidadOrigen;
	private String localidadDestino;
	private LocalDate fechaSalida;
	private Vehiculo vehiculo;
	private LinkedList<Pasajero> pasajeros;
	
	//constructor
	public Viaje(double costo, String locOr, String locDes, LocalDate fecha, Vehiculo vehiculo) {
		this.costoTotal = costo;
		this.localidadOrigen = locOr;
		this.localidadDestino = locDes;
		this.fechaSalida = fecha;
		this.vehiculo = vehiculo;
		this.pasajeros = new LinkedList<>();
	}
	
	//metodos
	public boolean lugarDisponible() {
		return (vehiculo.hayLugar(this.pasajeros.size()));
	}
	
	public void agregarPasajero(Pasajero pasajero) {
		this.pasajeros.add(pasajero);
	}
	
	public boolean inscripcionATiempo() {
		return ChronoUnit.DAYS.between(this.fechaSalida, LocalDate.now())>2;
	}
	
	public void agregarDestino(HashSet<String>listaDestinos) {
		listaDestinos.add(this.localidadDestino);
	}
	
	public double dividirGastos() {
		return this.costoTotal/(this.pasajeros.size()+1);
	}
	
	public void cobrarViaje() {
		this.pasajeros.stream().forEach(pasajero -> pasajero.cobrarViajePasajero(this.dividirGastos()));
		this.vehiculo.calcularMontoViaje(this.dividirGastos());
		
	}
}
