package ar.edu.unlp.info.oo1.ejercicio22;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class RetiroSucursal extends Envio {
	
	//variables de instancia
	private String dni;
	
	
	//constructor
	public RetiroSucursal(String dni, LocalDateTime fecha) {
		super(fecha);
		this.dni = dni;
	}
	//metodos
	public long tiempoEntrega() {
		return Duration.between(getFechaPedido(), getFechaEntrega()).toMinutes();
	}
}
