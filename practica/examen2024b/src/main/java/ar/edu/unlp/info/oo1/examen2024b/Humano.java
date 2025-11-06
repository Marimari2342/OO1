package ar.edu.unlp.info.oo1.examen2024b;

public class Humano extends Especie {

	//constructor
	public Humano(String nombre, Rol rol) {
		super(nombre,2,1,rol);
	}
	
	//metodos
	public double poderAtaque(int momentoDia) {
		return (momentoDia >= 8 && momentoDia < 20) ? this.poderBase()*1.4 : this.poderBase();
	}
	
	public boolean cumpleSubirNivel(int nivel) {
		return nivel>=7;
	}
}
