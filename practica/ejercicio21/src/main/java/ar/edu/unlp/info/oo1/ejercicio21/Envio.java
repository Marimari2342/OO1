package ar.edu.unlp.info.oo1.ejercicio21;
import java.time.LocalDate;
public abstract class Envio {
	
	//variables de instancia
	private LocalDate fechaDespacho;
	private String dirOrigen;
	private String dirDestino;
	private double peso;
	
	//constructor
	public Envio(String origen, String destino, double peso){
		this.fechaDespacho  = LocalDate.now();
		this.dirOrigen = origen;
		this.dirDestino = destino;
		this.peso = peso;
	}
	//metodo
	public double getPeso(){
		return this.peso;
	}
	public LocalDate getFecha() {
		return this.fechaDespacho;
	}
	
	public void agregarEnvio(Cliente cliente) {
		cliente.agregarEnvio(this);
	}
	
	public abstract double costoEnvio();
	
}
