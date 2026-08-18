package enunciado.examen2025;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class EncomiendaTest {

	Encomienda encomienda;
	Encomienda encomiendaInd;
	Alimento alimento;
	Documento documento;
	Fragil fragil;
	
	@Test
	void test() {
		this.alimento = new Alimento(LocalDate.of(2027,10,15),true);
		this.documento = new Documento(3,true);
		this.fragil = new Fragil("muñeca", false);
		this.encomienda = new Encomienda(1234, "Juana Perez");
		this.encomiendaInd = new Encomienda(3456, "Maria Lopez");
		this.encomienda.agregarContenido(alimento);
		this.encomienda.agregarContenido(documento);
		this.encomienda.agregarContenido(fragil);
		System.out.println(this.encomienda.generarEtiqueta().generar());
		this.encomiendaInd.agregarContenido(alimento);
		System.out.println(this.encomiendaInd.generarEtiqueta().generar());
	}

}
