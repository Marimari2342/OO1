package ar.edu.unlp.info.oo1.examen2025_1fecha;

import java.time.LocalDate;

public class AlquilerAuto extends Servicio{

	private double costoKm;
	private double kmRecorridos;
	private String tipoVehiculo;
	
	public AlquilerAuto(LocalDate fI, LocalDate fF, double costo, double costokm, double kmrec, String tipo) {
		super(fI, fF, costo);
		this.costoKm = costokm;
		this.kmRecorridos = kmrec;
		this.tipoVehiculo = tipo;
	}
	
	@Override
	public double calcularCosto(long cantDias, double diario) {
		return (this.costoKm*this.kmRecorridos) + (diario*cantDias);
	}
}
