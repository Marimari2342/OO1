package ar.edu.unlp.info.oo1.recetas;

public class Integral extends Base{

	//constructor
	public Integral(String tipo, int porciones) {
		super(tipo,porciones);
	}
	
	//metodos
	public String getTipo() {
		return "Integral";
	}
	
	public double costo() {
		return 2200;
	}
}
