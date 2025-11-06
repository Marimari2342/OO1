package ar.edu.unlp.info.oo1.examen2024b;

public class Orco extends Especie{
	
	//constructor
	public Orco(String nombre, Rol rol) {
		super(nombre,1,2,rol);
	}

	//metodos
	public double poderAtaque(int momentoDia) {
		return (momentoDia >= 8 && momentoDia < 20) ? this.poderBase() : this.poderBase()*1.6;
	}
	
	public boolean cumpleSubirNivel(int nivel) {
		return nivel%3==0;
	}
}
