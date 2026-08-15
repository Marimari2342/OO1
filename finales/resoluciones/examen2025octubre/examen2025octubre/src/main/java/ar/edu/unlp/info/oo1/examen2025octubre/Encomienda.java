package ar.edu.unlp.info.oo1.examen2025octubre;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class Encomienda {

	//variables de instancia
	private int numeroSeguimiento;
	private String destinatario;
	private LinkedList<Contenido> contenidos;
	
	//constructor
	public Encomienda(int num, String destinatario, Contenido contenido) {
		this.numeroSeguimiento = num;
		this.destinatario = destinatario;
		this.contenidos = new LinkedList<>();
		this.contenidos.add(contenido); //me aseguro que la encomienda tenga al menos un contenido, sino no tiene sentido hacer una encomienda vacia
	}
	
	//metodos
	public void agregarContenido(Contenido contenido) {
		this.contenidos.add(contenido);
	}
	
	public double calcularCosto() {
		return this.contenidos.stream().mapToDouble(contenido -> contenido.costo()).sum();
	}
	
	public String resumenEncomienda() {
		return this.destinatario+"\n"+this.contenidos.stream().map(contenido -> contenido.resumen()).collect(Collectors.joining(";\n"));
	}
}
