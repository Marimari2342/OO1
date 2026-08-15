package enunciado.examen2024febrero;

public class Servicio implements Item{

	//variables de instancia
	private int horasTrabajadas;
	private double valorHora;
	private String objetivo;
	
	//constructor
	public Servicio(int horas, double valorHora, String objetivo){
		this.horasTrabajadas = horas;
		this.valorHora = valorHora;
		this.objetivo = objetivo;
	}
	
	//metodos
	public double costo() {
		return this.horasTrabajadas*this.valorHora;
	}
}
