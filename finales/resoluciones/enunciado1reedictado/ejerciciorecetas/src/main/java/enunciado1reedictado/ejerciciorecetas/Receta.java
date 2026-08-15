package enunciado1reedictado.ejerciciorecetas;

import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Receta {

	//variables de instancia
	private String nombre;
	private LinkedList<Componente> componentes;

	//constructor
	public Receta(String nombre) {
		this.nombre = nombre;
		this.componentes = new LinkedList<>();
	}
	
	//metodos
	public String descripcionReceta() {
		return "Receta \""+this.nombre+"\"\n"
				+IntStream.range(0,this.componentes.size())
				.mapToObj(i -> (i+1) +". "+this.componentes.get(i).descripcion())
				.collect(Collectors.joining("\n"));
	}
	
	public double costoReceta() {
		return this.componentes.stream().mapToDouble(componente -> componente.costo()).sum();
	}
	
	public void agregarComponente(Componente componente) {
		this.componentes.add(componente);
	}
}
