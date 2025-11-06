package ar.edu.unlp.info.oo1.ejercicio19;

public class CancelacionModerada implements Cancelacion {

	//metodo
	public double calcularReembolso(Reserva reserva) {
		if (reserva.diasQueFaltan()>7) {
			return reserva.calcularPrecio();
		} else if (reserva.diasQueFaltan()>2) {
			return reserva.calcularPrecio()*0.5;
		} else 
			return 0;
	}
}
