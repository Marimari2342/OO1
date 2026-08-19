package enunciado.examen2023noviembre;

public class Servicio {

	//variables de instancia
	private String nombre;
	private double valor;
	private double valorDescuento;
	private int cantMinima;
	
	//constructor
	public Servicio(String nombre, double valor, double valorDescuento, int min) {
		this.nombre = nombre;
		this.valor = valor;
		this.valorDescuento = valorDescuento;
		this.cantMinima = min;
	}
	
	//metodos
	public double cotizar(int cantPedida) {
		return this.cumpleDescuento(cantPedida) ? this.valorDescuento*cantPedida : this.valor*cantPedida;
	}
	
	private boolean cumpleDescuento(int cantPedida) {
		return (this.cantMinima <= cantPedida);
	}
}
