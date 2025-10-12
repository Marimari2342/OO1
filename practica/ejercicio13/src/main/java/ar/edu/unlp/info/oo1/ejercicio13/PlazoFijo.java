package ar.edu.unlp.info.oo1.ejercicio13;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion {

	//variables de instancia
	private LocalDate fecha;
	private double montoDep;
	private double interes;
	
	//constructor
	public PlazoFijo(double monto, double interes){
		this.fecha = LocalDate.now();
		this.montoDep = monto;
		this.interes = interes;
	}
	
	//metodos
	public double calcularValor() {
		long diasPasados = ChronoUnit.DAYS.between(LocalDate.now(),this.fecha);
		return this.montoDep+this.interes*diasPasados;
	}
	
	//metodo para el test (es para setear la fecha de inicio y ver que haga bien la cuenta)
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
}
