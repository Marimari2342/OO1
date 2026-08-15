package ar.edu.unlp.info.oo1.examen2025julio;

import java.time.LocalDateTime;
import java.util.List;

public class ResultadoLanzamiento {

	//variables de instancia
	private LocalDateTime timeStamp;
	private List<Integer> resultados;
	
	//constructor
	public ResultadoLanzamiento(List<Integer> resultados) {
		this.resultados = resultados;
		this.timeStamp = LocalDateTime.now();
	}
	
	//metodos
	public int calcularValorTotal() {
		return this.resultados.stream().mapToInt(resultado -> resultado).sum();
	}
	
}
