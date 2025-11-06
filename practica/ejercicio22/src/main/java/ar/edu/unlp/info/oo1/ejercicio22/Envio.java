package ar.edu.unlp.info.oo1.ejercicio22;

import java.time.LocalDateTime;

public abstract class Envio {

	//variables de intancia
	private LocalDateTime fechaPedido;
	private LocalDateTime fechaEntrega;
	
	//constructor
	public Envio(LocalDateTime fecha) {
		this.fechaPedido = LocalDateTime.now();
		this.fechaEntrega = fecha;
	}
	
	//metodos
	public abstract long tiempoEntrega();
	
	public LocalDateTime getFechaPedido() {
		return this.fechaPedido;
	}
	
	public LocalDateTime getFechaEntrega() {
		return this.fechaEntrega;
	}
}
