package ar.edu.unlp.info.oo1.ejercicio24;
import java.util.LinkedList;

public class OrdenCompra extends Orden{

	//variables de instancia
	private double precioEnvio;
	
	//constructor
	public OrdenCompra(Usuario usuario, String domicilio, double precio) {
		super(usuario,domicilio);
		this.precioEnvio = precio;
	}
	
	//metodos
	public double calcularCosto() {
		return this.calcularCostoCompra(this.precioEnvio);
	}
}
