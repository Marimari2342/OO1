package ar.edu.unlp.info.oo1.recetas;

public class Condimento implements Componente{

	//variables de instancia
	private String mezcla;
	private int cucharadas;
	private boolean picante;
	
	//constructor
	public Condimento(String mezcla, int cucharadas, boolean picante) {
		this.mezcla = mezcla;
		this.cucharadas = cucharadas;
		this.picante = picante;
	}
	
	//metodos
	public String descripcion() {
		return "Condimento "+this.mezcla+" ("+this.esPicante()+", "+ this.cucharadas+" cucharaditas)";
	}
	
	private String esPicante() {
		return this.picante ? "picante" : "no picante";
	}
	
	public double costo() {
		return 0;
	}
}
