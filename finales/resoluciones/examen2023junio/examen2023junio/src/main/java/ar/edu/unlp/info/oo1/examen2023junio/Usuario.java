package ar.edu.unlp.info.oo1.examen2023junio;

import java.util.LinkedList;
import java.util.List;

public class Usuario {

	//variables de instancia
	private String nombre;
	private String clave;
	private String correo;
	private List<Artista> artistas;
	private List<ListaReproduccion> listas;
	
	//constructor
	public Usuario(String nombre, String clave, String correo) {
		this.nombre = nombre;
		this.clave = clave;
		this.correo = correo;
		artistas = new LinkedList<>();
		listas = new LinkedList<>();
	}
	
	//metodos
	public void seguirArtista(Artista artista) {
		this.artistas.add(artista);
	}
	
	public void crearLista(String nombre) {
		this.listas.add(new ListaReproduccion(nombre));
	}
	
	public void eliminarLista(ListaReproduccion lista) {
		this.listas.remove(lista);
	}
	
	public void dejarSeguirArtista(Artista artista) {
		this.artistas.remove(artista);
	}
}
