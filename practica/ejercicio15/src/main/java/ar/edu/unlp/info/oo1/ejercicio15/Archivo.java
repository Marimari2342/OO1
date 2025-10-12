package ar.edu.unlp.info.oo1.ejercicio15;

public class Archivo {

	//variables de instancia
	private String nombre;
	
	//constructor
	public Archivo(String nombre) {
		this.nombre = nombre;
	}
	
	//metodos
	public String getNombre() {
		return this.nombre;
	}
	
	public int tamanio() {
		return this.getNombre().length(); 
	}
}
