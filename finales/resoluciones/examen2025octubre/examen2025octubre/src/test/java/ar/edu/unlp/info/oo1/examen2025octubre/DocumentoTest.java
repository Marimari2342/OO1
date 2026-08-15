package ar.edu.unlp.info.oo1.examen2025octubre;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DocumentoTest {

	Documento documento;
	Documento confidencial;
	
	@Test
	void test() {
		this.documento = new Documento(3,false);
		this.confidencial = new Documento(2,true);
		//testeo costo
		assertEquals(this.documento.costo(),300);
		assertEquals(this.confidencial.costo(),400);
		//testeo resumen
		assertEquals(this.documento.resumen(),"Documento de 3 hojas.");
		assertEquals(this.confidencial.resumen(),"Documento de 2 hojas, confidencial.");
	}

}
