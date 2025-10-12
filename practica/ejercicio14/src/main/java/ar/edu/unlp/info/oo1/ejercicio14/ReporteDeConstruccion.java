package ar.edu.unlp.info.oo1.ejercicio14;
import java.util.LinkedList;

public class ReporteDeConstruccion {
	//variables de instancia
	private LinkedList<Pieza> piezas;
	
	//constructor 
	public ReporteDeConstruccion() {
		this.piezas = new LinkedList<>();
	}
	
	//metodos
	public void agregarPieza(Pieza pieza) {
		this.piezas.add(pieza);
	}
	
	public double volumenDeMaterial(String material) {
		return piezas.stream()
				.filter(pieza->pieza.getMaterial() == material)
				.mapToDouble(pieza->pieza.getVolumen())
				.sum();
	}
	
	public double superficieDeColor(String color) {
		return piezas.stream()
				.filter(pieza->pieza.getColor() == color)
				.mapToDouble(pieza->pieza.getSuperficie())
				.sum();
	}
}
