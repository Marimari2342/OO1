package ar.edu.unlp.info.oo1.ejercicio29;
import java.time.LocalDate;
import java.util.Set;

import ar.edu.unlp.info.oo1.ejercicio17.DateLapse;

public abstract class Actividad {

	//variables de instancia
	private LocalDate fechaInicio;
	private String direccionIP;
	
	//constructor
	public Actividad(String direccionIP) {
		this.direccionIP = direccionIP;
		this.fechaInicio = LocalDate.now();
	}
	
	//metodos
	public abstract double montoActividad();
	
	public void verIP(Set<String>iP) {
		iP.add(direccionIP);
	}
	
	public boolean estaEnPeriodo(DateLapse periodo) {
		return periodo.includesDate(this.fechaInicio);
	}
}
