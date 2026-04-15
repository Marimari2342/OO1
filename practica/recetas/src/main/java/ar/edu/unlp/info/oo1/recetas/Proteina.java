package ar.edu.unlp.info.oo1.recetas;

public class Proteina implements Componente{

	//variables de instancia
	private String tipo;
	private String presentacion;
	private int cantPorciones;
	private double precioPorcion;
	
	//constructor
	public Proteina(String tipo, String present, int cant, double precio) {
		this.tipo = tipo;
		this.presentacion = present;
		this.cantPorciones = cant;
		this.precioPorcion = precio;
	}
	
	//metodos
	public String descripcion() {
		return  "Proteína de "+this.tipo +" en "+this.presentacion+" ("+this.cantPorciones+" porciones a $"+this.precioPorcion+" por porción)";
	}
	public double costo() {
		return this.precioPorcion*this.cantPorciones;
	}
}
