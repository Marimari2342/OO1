package ar.edu.unlp.info.oo1.examen2024b;

public class Mago implements Rol{
	
	//metodos
	public double poderBase(Especie especie) {
		return especie.poderBaseMago();
	}
	
	public void subirHabilidades(Especie especie) {
		especie.subirNivelComoMago();
	}
}
