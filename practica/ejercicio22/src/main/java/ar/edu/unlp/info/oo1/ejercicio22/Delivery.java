package ar.edu.unlp.info.oo1.ejercicio22;
import java.time.LocalDateTime;
import java.util.Random;

public class Delivery extends Envio {

	//variables de instancia
	private String direccion;

	//constructor
	public Delivery(String direccion, LocalDateTime fecha) {
		super(fecha);
		this.direccion = direccion;
	}
	//metodos
	public long tiempoEntrega() {
		//no lo calcula el programa?? numero random??
		return new Random().nextLong(30)+60;
	}
}
