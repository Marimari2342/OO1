//ESTE ES EL EXAMEN FINAL DE JULIO 2026
package ar.edu.unlp.info.oo1.examen01;

import java.util.LinkedList;
import java.util.stream.*;

public class Orden {

	//variables de instancia
	private String nombre;
	private LinkedList<Trabajo> trabajos;
	
	//constructor
	public Orden(String nombre) {
		this.nombre = nombre;
		this.trabajos = new LinkedList<>();
	}
	
	//metodos
	public String descripcionOrden() {
	    return "Orden \"" + this.nombre + "\"\n" + //encabezado --> uso \antes de las comillas para que las tome como parte del string 
	            IntStream.range(0, this.trabajos.size())
	                     .mapToObj(i -> (i + 1) + ". " + this.trabajos.get(i).descripcion())
	                     .collect(Collectors.joining("\n"));
	}
	
	public double costoTotal() {
		return this.trabajos.stream().mapToDouble(trabajo -> trabajo.costo()).sum();
	}
	
	public void agregarTrabajo(Trabajo trabajo) {
		this.trabajos.add(trabajo);
	}
}
