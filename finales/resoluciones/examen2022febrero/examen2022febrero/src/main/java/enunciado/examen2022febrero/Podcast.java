package enunciado.examen2022febrero;

import java.util.List;
import java.util.LinkedList;

public class Podcast {

	//variables de instancia
	private String nombre;
	private List<Episodio> episodios;
	
	//constructor
	public Podcast(String nombre) {
		this.nombre = nombre;
		this.episodios = new LinkedList<Episodio>();
	}
	
	//metodos
	public void agregarEpisodio(Episodio episodio) {
		this.episodios.add(episodio);
	}
	
	public double puntaje() {
		return this.episodios.stream().mapToDouble(episodio -> episodio.puntaje()).sum();
	}
	
	public int cantTotalEscuchas() {
		return this.episodios.stream().mapToInt(episodio -> episodio.cantEscuchas()).sum();
	}
	
	public double duracionPromedio() {
		double suma = this.episodios.stream().mapToDouble(episodio -> episodio.duracion()).sum();
		return suma/this.episodios.size();
	}
}
