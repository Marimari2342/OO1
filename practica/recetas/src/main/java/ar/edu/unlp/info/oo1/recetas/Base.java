package ar.edu.unlp.info.oo1.recetas;

public abstract class Base implements Componente{
	
	//variables de instancia
	private String tipo;
	private int cantPorciones;
	
	//constructor
	public Base(String tipo, int porciones) {
		this.tipo = tipo;
		this.cantPorciones = porciones;
	}
	
	//metodos
	public String descripcion() {
		return "Base de "+this.tipo +" ("+this.getTipo()+ ", "+ this.cantPorciones + " porciones)";
	}
	
	abstract public double costo();
	abstract public String getTipo();
	
}
