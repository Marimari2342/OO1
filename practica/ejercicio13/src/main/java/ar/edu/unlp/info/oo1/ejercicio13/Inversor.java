package ar.edu.unlp.info.oo1.ejercicio13;
import java.util.LinkedList;

public class Inversor {

	//variables de instancia
	private LinkedList<Inversion> inversiones;
	
	//constructor
	public Inversor(){
		this.inversiones = new LinkedList<>();
	}
	
	//metodos
	public void agregarInversion(Inversion inversion) {
		this.inversiones.add(inversion);
	}
	
	public double valorInversionActual(){
		return inversiones.stream().mapToDouble(i -> i.calcularValor()).sum();
	}
}
