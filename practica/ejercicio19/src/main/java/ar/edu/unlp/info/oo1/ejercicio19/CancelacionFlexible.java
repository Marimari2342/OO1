package ar.edu.unlp.info.oo1.ejercicio19;

public class CancelacionFlexible implements Cancelacion {

	//metodo
	public double calcularReembolso(Reserva reserva) {
		return reserva.calcularPrecio();
	}
}
