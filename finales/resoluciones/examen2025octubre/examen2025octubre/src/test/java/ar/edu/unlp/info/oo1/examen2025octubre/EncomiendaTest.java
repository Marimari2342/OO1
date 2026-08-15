package ar.edu.unlp.info.oo1.examen2025octubre;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class EncomiendaTest {

	Encomienda encomienda;
	Documento documento;
	Fragil fragilEspecial;
	Alimento alimento;
	
	@Test
	void test() {
		this.alimento = new Alimento(LocalDate.of(2027,5,15),true);
		this.fragilEspecial = new Fragil("copas", true);
		this.documento = new Documento(3,false);
		this.encomienda = new Encomienda(1234,"Juana Lopez",this.alimento);
		this.encomienda.agregarContenido(documento);
		this.encomienda.agregarContenido(fragilEspecial);
		//testear costoTotal
		assertEquals(this.encomienda.calcularCosto(),1550);
		//testear resumenEncomienda
		System.out.println(this.encomienda.resumenEncomienda());
		assertEquals(this.encomienda.resumenEncomienda(),"Juana Lopez\nAlimento con vencimiento: 2027-05-15, requiere refrigeracion.;\nDocumento de 3 hojas.;\nProducto fragil, tipo: copas, requiere embalaje especial.");
	}

}
