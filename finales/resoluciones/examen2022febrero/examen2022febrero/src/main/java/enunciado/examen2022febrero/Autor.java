package enunciado.examen2022febrero;

import java.util.List;
import java.util.LinkedList;

public class Autor {

	//variables de instancia
	private String nombre;
	private List<Podcast> podcasts;
	
	//constructor
	public Autor(String nombre) {
		this.nombre = nombre;
		this.podcasts = new LinkedList<Podcast>();
	}
	
	//metodos
	public double puntaje() {
		return this.podcasts.stream().mapToDouble(podcast -> podcast.puntaje()).sum();
	}
}
