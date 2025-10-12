package ar.edu.unlp.info.oo1.ejercicio14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReporteDeConstruccionTest {

	private ReporteDeConstruccion reporte;
	private Cilindro cilindro;
	private Esfera esfera;
	private PrismaRectangular prisma;
	
	@BeforeEach
	void setUp() throws Exception {
		this.reporte = new ReporteDeConstruccion();
		this.cilindro = new Cilindro("Madera","Verde",3,6);
		this.esfera = new Esfera("Hierro", "Rojo",2);
		this.prisma = new PrismaRectangular("Madera","Rojo",10,5,4);
		this.reporte.agregarPieza(cilindro);
		this.reporte.agregarPieza(esfera);
		this.reporte.agregarPieza(prisma);
	}

	@Test
	void testVolumenDeMaterial() {
		double madeVol = this.cilindro.getVolumen()+this.prisma.getVolumen();
		double hieVol = this.esfera.getVolumen();
		assertEquals(reporte.volumenDeMaterial("Hierro"),hieVol);
		assertEquals(reporte.volumenDeMaterial("Madera"),madeVol);
	}
	
	@Test
	void testSuperficieDeColor() {
		double rojoSup = this.esfera.getSuperficie()+this.prisma.getSuperficie();
		double verdeSup = this.cilindro.getSuperficie();
		assertEquals(reporte.superficieDeColor("Rojo"),rojoSup);
		assertEquals(reporte.superficieDeColor("Verde"),verdeSup);
	}

}
