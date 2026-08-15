package enunciado1reedictado.ejerciciorecetas;

public class Condimento implements Componente{

	//variables de intancia
	private String mezcla;
	private int cantCucharadas;
	private boolean picante;
	
	//constructor
	public Condimento(String mezcla, int cant, boolean picante) {
		this.mezcla = mezcla;
		this.cantCucharadas = cant;
		this.picante = picante;
	}
	
	//metodos
	public String descripcion() {
		return "Condimento "+this.mezcla+" ("+(this.picante?"picante, ":"no picante, ")+this.cantCucharadas+" cucharaditas)";
	}
	
	public double costo() {
		return 0;
	}
}
