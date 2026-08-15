package ar.edu.unlp.info.oo1.examen2023junio;

import java.util.List;
import java.util.LinkedList;

public class Artista {

	//variables de instancia
	private String nombre;
	private List<Album> albums;
	
	//constructor
	public Artista(String nombre) {
		this.nombre = nombre;
		this.albums = new LinkedList<>();
	}
	
	//metodos
	public void agregarAlbum (Album album) {
		this.albums.add(album);
	}
}
