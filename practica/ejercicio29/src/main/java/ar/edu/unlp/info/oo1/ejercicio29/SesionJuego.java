package ar.edu.unlp.info.oo1.ejercicio29;
import java.util.LinkedList;

public class SesionJuego extends Actividad {

	//variables de instancia
	private double duracion;
	public LinkedList<Item> items;
	
	//constructor
	public SesionJuego(String direccionIP, double duracion) {
		super(direccionIP);
		this.duracion = duracion;
		this.items = new LinkedList<>();
	}
	
	//metodos
	public double montoActividad() {
		return (this.duracion > 360) ? this.items.stream().mapToDouble(item -> item.precioItem()).sum() : 0;
	}
}
