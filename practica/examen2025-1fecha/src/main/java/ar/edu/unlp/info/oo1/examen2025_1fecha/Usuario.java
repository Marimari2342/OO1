package ar.edu.unlp.info.oo1.examen2025_1fecha;
import java.util.LinkedList;

public class Usuario {

	private String nombre;
	private LinkedList<Servicio> servicios;
	
	public Usuario(String nombre) {
		this.nombre = nombre;
		this.servicios = new LinkedList<>();
	}
	
	public void agregarServicio(Servicio servicio) {
		this.servicios.add(servicio);
	}
	
	public double calcularCostoTotal() {
		return servicios.stream().mapToDouble(serv -> serv.calcularCostoServicio()).sum();
	}
}
