package ar.edu.unlp.info.oo1.examen2025_1fecha;

import java.time.LocalDate;

public class Estadia extends Servicio{

	private String destino;
	private int cantPersonas;
	
	public Estadia(LocalDate fI, LocalDate fF, double costo, String destino, int cant) {
		super(fI, fF, costo);
		this.destino = destino;
		this.cantPersonas = cant;
	}
	
	public double calcularCosto(long cantDias, double diario) {
		return diario*cantDias*this.cantPersonas;
	}
}
