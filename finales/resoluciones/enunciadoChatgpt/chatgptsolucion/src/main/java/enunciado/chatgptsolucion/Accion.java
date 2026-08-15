package enunciado.chatgptsolucion;

public class Accion implements Inversion{

	//variables de instancia
	private String nombre;
	private int cantidad;
	private double valorUnitario;
	
	//constructor
	public Accion(String nombre, int cantidad, double valor) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.valorUnitario = valor;
	}
	
	//metodos
	public double valorInversion() {
		return this.cantidad*this.valorUnitario;
	}
}
