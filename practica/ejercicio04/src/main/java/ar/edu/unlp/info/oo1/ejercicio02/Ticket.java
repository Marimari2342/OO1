package ar.edu.unlp.info.oo1.ejercicio02;
import java.time.LocalDate;

public class Ticket {

	//variables de instancia
	private LocalDate fecha;
	private int cantidadProductos;
	private double pesoTotal;
	private double precioTotal;
	
	//constructor
	public Ticket(int cantProd, double peso, double precio) {
		this.fecha=LocalDate.now();
		this.cantidadProductos=cantProd;
		this.pesoTotal=peso;
		this.precioTotal=precio;
	}
	
	//getters y setters
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public int getCantidadDeProductos() {
		return this.cantidadProductos;
	}
	
	public double getPesoTotal() {
		return this.pesoTotal;
	}
	
	public double getPrecioTotal() {
		return this.precioTotal;
	}
	
	//metodos pedidos
	public double impuesto() {
		return this.precioTotal*0.21;
	}
	
}