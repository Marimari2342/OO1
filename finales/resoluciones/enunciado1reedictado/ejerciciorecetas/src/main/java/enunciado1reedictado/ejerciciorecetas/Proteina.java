package enunciado1reedictado.ejerciciorecetas;

public class Proteina implements Componente{

	//variables de instancia
	private String tipoProteina;
	private String forma;
	private int cantidad;
	private double precio;
	
	//constructor
	public Proteina(String tipo, String forma, int cant, double precio) {
		this.tipoProteina = tipo;
		this.forma = forma;
		this.cantidad = cant;
		this.precio = precio;
	}
	
	//metodos
	public String descripcion() {
		return "Proteína de "+this.tipoProteina+" en "+this.forma+" ("
				+this.cantidad+" a $"+this.precio+" por porción)";
	}
	
	public double costo() {
		return this.precio*this.cantidad;
	}
}
