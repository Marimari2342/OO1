package ar.edu.unlp.info.oo1.examen2024b;

public class Guerrero implements Rol {

	//metodos
	public double poderBase(Especie especie) {
		return especie.poderBaseGuerrero();
	}
	
	public void subirHabilidades(Especie especie) {
		especie.subirNivelComoGuerrero();
	}
}
