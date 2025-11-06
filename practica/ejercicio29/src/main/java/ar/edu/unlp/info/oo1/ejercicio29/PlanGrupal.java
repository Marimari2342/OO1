package ar.edu.unlp.info.oo1.ejercicio29;

import ar.edu.unlp.info.oo1.ejercicio17.DateLapse;

public class PlanGrupal implements Plan {

	//variables de instancia
	private int cantDireccionIP;
	
	//constructor
	public PlanGrupal(int cant) {
		this.cantDireccionIP = cant;
	}
	
	//metodos
	public double calcularPrecioBase() {
		return 800*this.cantDireccionIP;
	}
	
	public double montoPenalizacion(Cliente cliente, DateLapse periodo) {
		if(cliente.antiguedad()<=10) {
			int usoIP = cliente.calcularCantidadIP(periodo);
			return (usoIP>this.cantDireccionIP) ? 500*(usoIP-this.cantDireccionIP) : 0;
		}
		return 0;
	}
}
