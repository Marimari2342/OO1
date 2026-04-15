package ar.edu.unlp.info.oo1.ejercicio23;

public class Pasajero extends Usuario{

	//variables de instancia
	
	//constructor
	public Pasajero(String nombre, String direccion, double saldo) {
		super(nombre, direccion, saldo);
	}
	
	//metodos
	public void inscribirEnViaje(Viaje viaje) {
		if (viaje.lugarDisponible() && this.tengoSaldo() && viaje.inscripcionATiempo()) {
			viaje.agregarPasajero(this);
			this.agregarDestino(viaje);
		}
	}
}
