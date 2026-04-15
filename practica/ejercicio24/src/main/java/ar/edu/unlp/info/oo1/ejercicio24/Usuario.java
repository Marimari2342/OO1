package ar.edu.unlp.info.oo1.ejercicio24;
import java.util.LinkedList;

public class Usuario {

	//variables de instancia
	private String nombreCompleto;
	private String direccion;
	private LinkedList<Orden> ordenes;
	
	//constructor
	public Usuario(String nombre, String direccion) {
		this.nombreCompleto = nombre;
		this.direccion = direccion;
		this.ordenes = new LinkedList<>();
	}
	
	//metodos
	public void agregarOrden(Orden orden) {
		this.ordenes.add(orden);
	}
	
	public LinkedList<Orden> getOrdenes(){
		return this.ordenes;
	}
}
