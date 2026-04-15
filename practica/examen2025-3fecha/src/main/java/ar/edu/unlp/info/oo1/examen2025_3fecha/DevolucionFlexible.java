package ar.edu.unlp.info.oo1.examen2025_3fecha;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DevolucionFlexible implements PoliticaDevolucion{

	private double seguro;
	
	public DevolucionFlexible(double seguro) {
		this.seguro = seguro;
	}
	
	private long calcularDiasEntre(LocalDate antes,LocalDate despues) {
		return ChronoUnit.DAYS.between(antes, despues);
	}
	
	public double calcularReembolso(LocalDate fechaCompra, LocalDate fechaEvento, double entrada) {
		if (this.calcularDiasEntre(LocalDate.now(),fechaEvento)<=0) {
			return 0;
		}
		return (this.calcularDiasEntre(fechaCompra,LocalDate.now())<3) ? entrada+this.seguro : entrada*0.5;
	}
}
