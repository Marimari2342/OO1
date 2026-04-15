package ar.edu.unlp.info.oo1.examen2025_3fecha;
import java.time.*;

public class Entrada {
	
	private double precioPagado;
	private LocalDate fechaCompra;
	private LocalDate fechaEvento;
	private PoliticaDevolucion devolucion;

	public Entrada(double precio, LocalDate fechaEvento, PoliticaDevolucion dev) {
		this.precioPagado = precio;
		this.fechaCompra = LocalDate.now();
		this.fechaEvento = fechaEvento;
		this.devolucion = dev;
	}
	
	//este es para el test
	public Entrada(double precio, LocalDate fechaEvento, PoliticaDevolucion dev, LocalDate fechaCompra) {
		this.precioPagado = precio;
		this.fechaCompra = fechaCompra;
		this.fechaEvento = fechaEvento;
		this.devolucion = dev;
	}
	
	public double calcularReembolso() {
		return this.devolucion.calcularReembolso(this.fechaCompra, this.fechaEvento, this.precioPagado);
	}
	
	public void cambiarPoliticaDevolucion(PoliticaDevolucion dev) {
		this.devolucion = dev;
	}
}
