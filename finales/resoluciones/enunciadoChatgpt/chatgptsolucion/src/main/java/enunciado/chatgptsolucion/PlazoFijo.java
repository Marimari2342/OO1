package enunciado.chatgptsolucion;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion{

	//variables de instancia
	private LocalDate fechaConstitucion;
	private double montoDeposito;
	private double porcentajeInteres;
	
	//constructor
	public PlazoFijo(LocalDate fecha, double monto, double porcentaje) {
		this.fechaConstitucion = fecha;
		this.montoDeposito = monto;
		this.porcentajeInteres = porcentaje;
	}
	
	//metodos
	public double valorInversion() {
		return  this.montoDeposito*(1 + 
				this.porcentajeInteres*ChronoUnit.DAYS.between(this.fechaConstitucion,LocalDate.now()));
	}
}
