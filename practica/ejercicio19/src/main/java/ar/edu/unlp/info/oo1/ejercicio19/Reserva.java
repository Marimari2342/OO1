package ar.edu.unlp.info.oo1.ejercicio19;

import ar.edu.unlp.info.oo1.ejercicio17.DateLapse;
import java.time.LocalDate;

public class Reserva {

	//variables de instancia
	private DateLapse periodo;
	private double precioNoche;
	
	//constructor
	public Reserva(DateLapse periodo,double precio) {
		this.periodo = periodo;
		this.precioNoche = precio;
	}
	
	//metodos
	public DateLapse getPeriodo() {
		return this.periodo;
	}
	
	public double calcularPrecio() {
		return this.precioNoche*this.periodo.sizeDays();
	}
	
	public boolean enCurso() {
		return this.periodo.includesDate(LocalDate.now());
	}
	
	public long diasQueFaltan() {
		return this.periodo.diasHastaInicio();
	}
}
