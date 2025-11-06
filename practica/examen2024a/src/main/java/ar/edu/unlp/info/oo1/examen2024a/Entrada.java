package ar.edu.unlp.info.oo1.examen2024a;
import java.time.LocalDate;
import java.time.Period;
import ar.edu.unlp.info.oo1.ejercicio17.*;

public class Entrada {

	//variables de instancia
	private Evento evento;
	private boolean seguro;
	private LocalDate fecha;
	
	//constructor
	public Entrada(Evento evento, boolean seguroReembolso) {
		this.evento = evento;
		this.seguro = seguroReembolso;
		this.fecha = LocalDate.now();
	}
	
	//metodos

	public boolean estaEnPeriodo(DateLapse periodo) {
		return periodo.includesDate(this.fecha);
	}
	
	public double precioEntrada() {
		return (this.seguro) ? this.evento.precioAsistencia(fecha)*500 : this.evento.precioAsistencia(fecha);
	}
	
	public double calcularMontoRecuperar() {
		int dias = evento.calcularDias(this.fecha);
		if (seguro) {
			if (dias>=30) {
				return this.evento.precioAsistencia(fecha)*0.65;
			} else {
				return this.evento.precioAsistencia(fecha)*0.15;
			}
		}else {
			if (dias<30) {
				return this.evento.precioAsistencia(fecha)*0.50;
			} else {
				return 0;
			}
		}
	}
	
	public boolean entradaEventoFuturo() {
		return !this.fecha.isBefore(LocalDate.now());
	}
	
	
	public int masProxima(Entrada otraEntrada) {
		return this.fecha.compareTo(otraEntrada.fecha);
	}
}
