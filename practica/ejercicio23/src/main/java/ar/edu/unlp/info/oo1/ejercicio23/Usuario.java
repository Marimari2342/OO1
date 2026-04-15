package ar.edu.unlp.info.oo1.ejercicio23;
import java.util.HashSet;

public abstract class Usuario {
	
	//variables de instancia
	private String nombre;
	private String direccion;
	private double saldoCuenta;
	private HashSet<String> destinos;
	
	//constructor
	public Usuario(String nombre, String direccion, double saldo) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.saldoCuenta = saldo;
		this.destinos = new HashSet<>();
	}
	
	//metodos
	public void cargarSaldo(double saldo) {
		this.saldoCuenta+=saldo;
	}
	
	public void cobrarCosto(double costoCobrar) {
		this.saldoCuenta-=costoCobrar;
	}
	
	public HashSet<String> listarDestinos(){
		return this.destinos;
	}
	
	public boolean tengoSaldo() {
		return this.saldoCuenta>0;
	}
	
	public void agregarDestino(Viaje viaje) {
		viaje.agregarDestino(this.destinos);
	}
	
	public void cobrarViajeConductor(double costo) {
		this.saldoCuenta-=costo;
	}
	
	public void cobrarViajePasajero(double costo) {
		if (this.cumpleCondicionDescuento()) {
			this.saldoCuenta-=(costo+5000);
		}else {
			this.saldoCuenta-=costo;
		}
	}
	
	public boolean cumpleCondicionDescuento() {
		return this.destinos.size()>0;
	}
}
