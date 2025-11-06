package ar.edu.unlp.info.oo1.ejercicio21;

import ar.edu.unlp.info.oo1.ejercicio17.DateLapse;

public class PersonaFisica extends Cliente{

	//variables de instancia
	private String dni;
	
	//constructor
	public PersonaFisica(String nombre, String dir, String dni){
		super(nombre, dir);
		this.dni = dni;
	}
	
	@Override
	public double montoPagar(DateLapse periodo) {
		return super.montoPagar(periodo)*0.9;
	}
}
