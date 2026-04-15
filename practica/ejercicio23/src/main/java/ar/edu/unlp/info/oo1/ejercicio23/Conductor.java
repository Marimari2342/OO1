package ar.edu.unlp.info.oo1.ejercicio23;
import java.util.LinkedList;

public class Conductor extends Usuario {

	//variables de instancia
	private LinkedList<Vehiculo> vehiculos;
	
	//constructor
	public Conductor(String nombre, String direccion, double saldo, Vehiculo vehiculo) {
		super(nombre, direccion, saldo);
		this.vehiculos = new LinkedList<>();
		this.vehiculos.add(vehiculo);
	}
	
	//metodos
	public void crearViaje(Vehiculo vehiculo, Viaje viaje) {
		vehiculo.agregarViaje(viaje);
		this.agregarDestino(viaje);
	}
}
