package ar.edu.unlp.info.oo1.examen2025julio;

import java.util.LinkedList;
import java.util.List;

public class Cubilete {

	//variables de instancia
	private LinkedList<Dado> dados;

	//constructor
	public Cubilete(Dado dado) {
		this.dados = new LinkedList<>();
		this.dados.add(dado);
	}
	
	//metodos
	public ResultadoLanzamiento lanzar() {
		List<Integer> resultados = this.dados.stream().map(dado -> dado.lanzar()).toList();
		return new ResultadoLanzamiento(resultados);
	}
	
	public void agregarDado(Dado dado) {
		this.dados.add(dado);
	}
	
}
