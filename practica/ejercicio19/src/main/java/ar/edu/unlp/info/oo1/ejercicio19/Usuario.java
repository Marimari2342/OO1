package ar.edu.unlp.info.oo1.ejercicio19;

import ar.edu.unlp.info.oo1.ejercicio17.DateLapse;
import java.util.LinkedList;

public class Usuario {
	
	//variables de instancia
	private String nombre;
	private String direccion;
	private String dni;
	private LinkedList<Propiedad> propiedades;
	
	//constructor
	public Usuario(String nombre, String dir, String dni) {
		this.nombre = nombre;
		this.direccion = dir;
		this.dni = dni;
		this.propiedades = new LinkedList<>();
	}
	
	//metodos
	public void agregarPropiedad(Propiedad propiedad) {
		this.propiedades.add(propiedad);
	}
	
	public double calcularIngresos(DateLapse periodo) { 
		return this.propiedades.stream()
				.mapToDouble(prop -> prop.calcularIngresoPropiedad(periodo))
				.sum()*0.75;
	}
}
