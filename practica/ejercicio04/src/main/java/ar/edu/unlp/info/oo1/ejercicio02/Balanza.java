package ar.edu.unlp.info.oo1.ejercicio02;

public class Balanza {
	
	//variables
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	
	//constructor
	public Balanza( int cantProd, int precioT, int pesoT) {
		this.cantidadDeProductos=cantProd;
		this.precioTotal=precioT;
		this.pesoTotal=pesoT;
	}
	public Balanza() {}
	
	//getters y setters
	public int getCantidadDeProductos() {
		return this.cantidadDeProductos;
	}
	
	public double getPrecioTotal() {
		return this.precioTotal;
	}
	
	public double getPesoTotal() {
		return this.pesoTotal;
	}
	
	//metodos
	public void ponerEnCero() {
		this.pesoTotal = 0;
		this.precioTotal = 0;
		this.cantidadDeProductos = 0;
	}
	
	public void agregarProducto(Producto producto) {
		this.cantidadDeProductos ++;
		this.pesoTotal+=producto.getPeso();  
		this.precioTotal+=producto.getPrecio();
	}
	
	public Ticket emitirTicket() {
		return new Ticket(this.cantidadDeProductos, this.pesoTotal, this.precioTotal);
	}
}