package ar.edu.unlp.info.oo1.examen2025julio;

public class DadoExplosivo extends DadoEstandar{

	//metodos
	public int lanzar() {
        int resultado = super.lanzar();
        while (resultado == 6) {
            resultado += super.lanzar();
        }
        return resultado;
    }
}
