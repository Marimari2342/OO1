package ar.edu.unlp.info.oo1.ejercicio22;

public class Vianda extends Producto {

	//variables de instancia
	private boolean aptaCeliaco;
	private boolean disponibilidad;
	
	//constructor
	public Vianda(String nombre, double precio, boolean apta, boolean disp) {
		super(nombre,precio);
		this.aptaCeliaco = apta;
		this.disponibilidad = disp;
	}
	
	//metodos
	public boolean aptaCeliaco() {
		return this.aptaCeliaco;
	}
}
