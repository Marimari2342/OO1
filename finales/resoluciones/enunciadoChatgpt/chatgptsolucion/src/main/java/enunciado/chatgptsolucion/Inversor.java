package enunciado.chatgptsolucion;
import java.util.LinkedList;

public class Inversor {
	
	//variables de instancia
	private String nombre;
	private LinkedList<Inversion> inversiones;
	
	//constructor
	public Inversor(String nombre) {
		this.nombre = nombre;
		this.inversiones = new LinkedList<Inversion>();
	}
	
	//metodos
	public void agregarInversion(Inversion inversion) {
		this.inversiones.add(inversion);
	}
	
	public double valorActual() {
		return this.inversiones.stream().mapToDouble(inversion -> inversion.valorInversion()).sum();
	}

}
