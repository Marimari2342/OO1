package ar.edu.unlp.info.oo1.ejercicio09;
import java.util.LinkedList;
import java.util.List;

public class Farola {
	
	//variables
	private boolean encendida;
	private LinkedList<Farola> farolasVecinas;
	
	//Crear una farola. Debe inicializarla como apagada
	public Farola () {
		this.encendida = false;
		this.farolasVecinas = new LinkedList<>();
	}
	
	/*Crea la relación de vecinos entre las farolas. La relación de vecinos entre las farolas es recíproca, es decir 
	 * el receptor del mensaje será vecino de otraFarola, al igual que otraFarola también se convertirá en vecina del 
	 * receptor del mensaje*/
	public void pairWithNeighbor( Farola otraFarola ) {
		if (!this.farolasVecinas.contains(otraFarola)) {
			this.farolasVecinas.add(otraFarola);
			otraFarola.farolasVecinas.add(this);
		}
	}

	//Retorna sus farolas vecinas
	public List<Farola> getNeighbors (){
		return this.farolasVecinas;
	}


	//Si la farola no está encendida, la enciende y propaga la acción.
	public void turnOn() {
		if (this.isOff()) {
			this.encendida=true;
			for (Farola f : this.farolasVecinas) {
				f.turnOn();
			}
		}
	}

	//Si la farola no está apagada, la apaga y propaga la acción.
	public void turnOff() {
		if (this.isOn()) {
			this.encendida=false;
			for (Farola f : this.farolasVecinas) {
				f.turnOff();
			}
		}
	}

	//Retorna true si la farola está encendida.
	public boolean isOn() {
		return this.encendida;
	}

	//Retorna true si la farola está apagada.
	public boolean isOff() {
		return !this.encendida;
	}

}
