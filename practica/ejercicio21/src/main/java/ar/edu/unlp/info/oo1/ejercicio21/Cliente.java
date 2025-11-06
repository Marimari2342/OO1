package ar.edu.unlp.info.oo1.ejercicio21;
import java.util.LinkedList;
import ar.edu.unlp.info.oo1.ejercicio17.DateLapse;

public abstract class Cliente {
	
	//variables de instancia
	private String nombre;
	private String direccion;
	private LinkedList<Envio> envios;
	
	//constructor
	public Cliente(String nombre,String dir){
		this.nombre = nombre;
		this.direccion = dir;
		this.envios = new LinkedList<>();
	}
	
	//metodos
	public LinkedList<Envio> getEnvios() {
		return this.envios;
	}
	
	public double montoPagar(DateLapse periodo) {
		return this.getEnvios().stream()
				.filter(envio -> periodo.includesDate(envio.getFecha()))
				.mapToDouble(envio -> envio.costoEnvio()).sum();
	}
	
	public void agregarEnvio(Envio envio){
		this.envios.add(envio);
	}
}
