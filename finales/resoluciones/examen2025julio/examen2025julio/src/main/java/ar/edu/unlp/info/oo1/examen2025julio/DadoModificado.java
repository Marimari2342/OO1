package ar.edu.unlp.info.oo1.examen2025julio;

public class DadoModificado extends DadoEstandar{

	//variables de instancia
	private int modificacion;
	
	//constructor
	public DadoModificado(int valor) {
		this.modificacion = valor;
	}
	
	//metodos
	public int lanzar() {
		return super.lanzar()+this.modificacion;
	}
}
