package ar.edu.unlp.info.oo1.examen2025julio;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class CubileteTest {

	Cubilete cubilete1;
	Cubilete cubilete2;
	Cubilete cubilete3;
	Cubilete cubilete4;
	DadoEstandar dado1;
	DadoEstandar dado2;
	DadoExplosivo dadoex;
	DadoPonderado dadopon;
	DadoModificado dadomo;

	@Test
	void test() {
		dado1 = new DadoEstandar();
		dado2 = new DadoEstandar();
		cubilete1 = new Cubilete(dado1);
		cubilete1.agregarDado(dado2);
		System.out.println("2 dados estandar: "+cubilete1.lanzar().calcularValorTotal());
		assertTrue(cubilete1.lanzar().calcularValorTotal()<=12);
		
		dadoex = new DadoExplosivo();
		cubilete2 = new Cubilete(dadoex);
		System.out.println("1 dado explosivo: "+cubilete2.lanzar().calcularValorTotal());
		
		dadomo = new DadoModificado(2);
		cubilete3 = new Cubilete(dadomo);
		System.out.println("1 dado modificado+2: "+cubilete3.lanzar().calcularValorTotal());
		assertTrue(cubilete3.lanzar().calcularValorTotal()<=8);
		
		
		//para el dado ponderado uso un Map 
		Map<Integer, Integer> pesos = new HashMap<>();
		pesos.put(1, 1);
		pesos.put(2, 1);
		pesos.put(3, 5); // el 3 tiene más probabilidad
		pesos.put(4, 1);
		pesos.put(5, 1);
		pesos.put(6, 1);
		
		dadopon = new DadoPonderado(pesos);
		cubilete4 = new Cubilete(dadopon);
		System.out.println("1 dado ponderado (3 con mas probabilidad): "+cubilete4.lanzar().calcularValorTotal());
		
	}

}
