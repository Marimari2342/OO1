package ar.edu.unlp.info.oo1.examen2023junio;

import java.util.List;
import java.time.LocalDate;
import java.util.LinkedList;

public class Album {

	//variables de instancia
	private String nombre;
	private LocalDate fecha;
	private List<Cancion> canciones;
	
	//constructor
	public Album(String nombre, LocalDate fecha) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.canciones = new LinkedList<>();
	}
	
	//metodos
	public void agregarCancion(Cancion cancion) {
		this.canciones.add(cancion);
	}
	
	public List<Cancion> getCanciones() {
		return canciones;
	}
}
