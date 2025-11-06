package ar.edu.unlp.info.oo1.examen2024a;
import java.util.LinkedList;
import java.time.LocalDate;
import ar.edu.unlp.info.oo1.ejercicio17.*;

public class Usuario {
	
	//variables de instancia
	private String nombre;
	private LinkedList<Entrada> entradas;
	
	//constructor
	public Usuario(String nombre) {
		this.nombre = nombre;
		this.entradas = new LinkedList<>();
	}
	
	//metodos
	public double consultarPrecioAsistencia(Evento evento, LocalDate fecha) {
		return evento.precioAsistencia(fecha);
	}
	
	public void comprarEntrada(Entrada entrada) {
		this.entradas.add(entrada);
	}
	
	public double montoEntradasPeriodo(DateLapse periodo) {
		return this.entradas.stream()
				.filter(entrada -> entrada.estaEnPeriodo(periodo))
				.mapToDouble(entrada -> entrada.precioEntrada()).sum();
	}
	
	public Entrada entradaSiguienteEvento() {
		return this.entradas.stream().
				filter(entrada -> entrada.entradaEventoFuturo()) // solo las que no pasaron
		        .min((e1, e2) -> e1.masProxima(e2)) // la más próxima
		        .orElse(null); // si no hay, devuelve null
	}
}
