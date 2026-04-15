package ar.edu.unlp.info.oo1.recetas;
import java.util.LinkedList;

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
	public void agregarComponente(Componente componente) {
		this.componentes.add(componente);
	}
	
	public double costoEstimado() {
		return this.componentes.stream().mapToDouble(comp -> comp.costo()).sum();
	}
	
	private String descripciones() {
		String devolver="";
		for (int i = 0; i < this.componentes.size(); i++) {
	        devolver += (i + 1)+". "+componentes.get(i).descripcion()+"\n";
	    }
		return devolver;
	}
	public String obtenerDescripcion() {
		return "Receta "+this.nombre+ "\n" +this.descripciones();
	}
}
