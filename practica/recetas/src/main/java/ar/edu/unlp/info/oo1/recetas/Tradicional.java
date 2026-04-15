package ar.edu.unlp.info.oo1.recetas;

public class Tradicional extends Base{

	//constructor
	public Tradicional(String tipo, int porciones) {
		super(tipo,porciones);
	}
	//metodos
	public String getTipo() {
		return "Tradicional";
	}
	
	public double costo() {
		return 1500;
	}
}
