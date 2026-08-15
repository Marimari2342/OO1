package enunciado1reedictado.ejerciciorecetas;

public class Base implements Componente{
	
	//variables de instancia
	private String tipoBase;
	private int cantidad;
	private boolean integral;
	
	//constructor
	public Base(String tipo, int cant, boolean integral) {
		this.tipoBase = tipo;
		this.cantidad = cant;
		this.integral = integral;
	}
	
	//metodos
	public String descripcion() {
		return "Base de "+this.tipoBase+" ("+(this.integral?"integral, ":"")+this.cantidad+" porciones)"; 
	}
	
	public double costo() {
		return this.integral ? 2200 : 1500;
	}
}
