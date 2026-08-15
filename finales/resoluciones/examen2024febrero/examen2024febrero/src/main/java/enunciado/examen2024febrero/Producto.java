package enunciado.examen2024febrero;

public class Producto implements Item{

	//variables de instancia
	private double costo;
	private double costoDeEnvioPorKilo;
	private double peso;
	private String nombre;
	
	//constructor
	public Producto (double costo, double costoEnvioPorKilo, double peso, String nombre) {
		this.costo = costo;
		this.costoDeEnvioPorKilo = costoEnvioPorKilo;
		this.peso = peso;
		this.nombre = nombre;
	}
	
	//metodos
	public double costo() {
		return this.costo + (this.costoDeEnvioPorKilo*this.peso);
	}
}
