package ar.edu.unlp.info.oo1.ejercicio24;
import java.util.LinkedList;
import java.time.LocalDate;

public abstract class Orden {

	//variables de instancia
	private LocalDate fecha;
	private Usuario usuario;
	private String domicilio;
	private LinkedList<Producto> productos;
	private double costoTotal = 0;
	
	//constructor
	public Orden(Usuario usuario, String domicilio) {
		this.fecha = LocalDate.now();
		this.usuario = usuario;
		this.domicilio = domicilio;
		this.productos = new LinkedList<>();
	}
	
	//metodos
	public abstract double calcularCosto();
	
	public double calcularCostoProductos() {
		return this.productos.stream().mapToDouble(producto -> producto.calcularCosto()).sum();
	}
	
	public double calcularCostoCompra(double envio) {
		return (this.productos.size()>5) ? (this.calcularCostoProductos()+envio)*0.9 : this.calcularCostoProductos()+envio;
	}
	
	public double calcularCostoServicio(double servTecnico, boolean descuento) {
		return (descuento) ? (this.calcularCostoProductos()+servTecnico)*0.9 : this.calcularCostoProductos()+servTecnico;
	}
}
