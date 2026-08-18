package enunciado.examen2025;

import java.time.LocalDate;

public class Alimento implements Contenido{
	
	//variables de instancia
	public LocalDate vencimiento;
	public boolean refrigeración;
		
	//constructor
	public Alimento(LocalDate vencimiento, boolean refrigeracion) {
		this.vencimiento = vencimiento;
		this.refrigeración = refrigeracion;
	}
		
	//metodos
	public double costo() {
		return this.refrigeración ? 550 : 400;
	}
		
	public String resumen() {
		return "Alimento con vencimiento: "+this.vencimiento;
	}
	
	public String instruccion() {
		return this.refrigeración?"Requiere refrigeracion":"";
	}
}
