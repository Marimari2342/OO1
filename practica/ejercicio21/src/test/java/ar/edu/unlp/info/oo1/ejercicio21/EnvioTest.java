package ar.edu.unlp.info.oo1.ejercicio21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EnvioTest {

	private Envio local1;
	private Envio local2;
	private Envio interurb1;
	private Envio interurb2;
	private Envio interurb3;
	private Envio internac1;
	private Envio internac2;
	
	@BeforeEach
	void setUp() throws Exception {
		this.internac1 = new EnvioInternacional("Argentina","Francia",3200,true);
		this.internac2 = new EnvioInternacional("Argentina","Japon",800,false);
		this.interurb1 = new EnvioInterurbano("Buenos Aires","La Pampa",4500,90);
		this.interurb2 = new EnvioInterurbano("Buenos Aires","Catamarca",4000,600);
		this.interurb3 = new EnvioInterurbano("Mendoza","Cordoba",1500,330);
		this.local1 = new EnvioLocal("La Plata","Villa Elisa",2500,false);
		this.local2 = new EnvioLocal("La Plata","Gonnet",2000,true);
	}

	@Test
	void testCostoEnvio() {
		assertEquals(this.internac1.costoEnvio(),44200);
		assertEquals(this.internac2.costoEnvio(),13000);
		assertEquals(this.interurb1.costoEnvio(),90000);
		assertEquals(this.interurb2.costoEnvio(),120000);
		assertEquals(this.interurb3.costoEnvio(),37500);
		assertEquals(this.local1.costoEnvio(),1000);
		assertEquals(this.local2.costoEnvio(),1500);
	}

}
