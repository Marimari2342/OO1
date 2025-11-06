package ar.edu.unlp.info.oo1.ejercicio29;

import ar.edu.unlp.info.oo1.ejercicio17.DateLapse;

public class PlanIndividual implements Plan {

	//variables de instancia
	private double cantMinutos;
		
	//constructor
	public PlanIndividual(double cant) {
		this.cantMinutos = cant;
	}
		
	//metodos
	public double calcularPrecioBase() {
		return this.cantMinutos*20;
	}
	
	public double montoPenalizacion(Cliente cliente, DateLapse periodo) {
		return (cliente.calcularCantidadIP(periodo)>1) ? 300*(cliente.calcularCantidadIP(periodo)-1) : 0;
	}
}
