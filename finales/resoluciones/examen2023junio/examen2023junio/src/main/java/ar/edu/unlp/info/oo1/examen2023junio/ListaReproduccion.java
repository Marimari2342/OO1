package ar.edu.unlp.info.oo1.examen2023junio;

import java.util.List;
import java.util.LinkedList;

public class ListaReproduccion {

	//variables de instancia
	private String nombre;
	private List<Cancion> canciones;
	
	//constructor
	public ListaReproduccion(String nombre) {
		this.nombre = nombre;
		this.canciones = new LinkedList<>();
	}
	
	//metodos
	public void agregarCancion(Cancion cancion) {
		this.canciones.add(cancion);
	}
	
	public void quitarCancion(Cancion cancion) {
		this.canciones.remove(cancion);
	}
	
	public void agregarAlbum(Album album) {
		this.canciones.addAll(album.getCanciones());
	}
	
}
