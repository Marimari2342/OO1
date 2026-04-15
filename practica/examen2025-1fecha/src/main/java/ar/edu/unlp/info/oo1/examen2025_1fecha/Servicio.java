package ar.edu.unlp.info.oo1.examen2025_1fecha;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Servicio {

	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private double costoDiario;
	
	public Servicio(LocalDate fI, LocalDate fF, double costo) {
		this.fechaInicio = fI;
		this.fechaFin = fF;
		this.costoDiario = costo;
	}
	
	abstract public double calcularCosto(long cantDias, double costoDiario);
	
	private long calcularDias() {
		return ChronoUnit.DAYS.between(fechaInicio, fechaFin);
	}
	
	public double calcularCostoServicio() {
		return calcularCosto(calcularDias(), this.costoDiario);
	}
}
