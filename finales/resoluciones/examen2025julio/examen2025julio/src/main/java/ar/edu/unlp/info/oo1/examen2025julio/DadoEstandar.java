package ar.edu.unlp.info.oo1.examen2025julio;

import java.util.Random;

public class DadoEstandar implements Dado{

	//variables de instancia
	private Random random;
	
	//constructor
	public DadoEstandar() {
		this.random = new Random();
	}
	//metodos
	public int lanzar() {
		return random.nextInt(6) + 1;
	}
}
