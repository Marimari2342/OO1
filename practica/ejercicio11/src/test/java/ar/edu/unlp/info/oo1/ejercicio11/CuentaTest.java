package ar.edu.unlp.info.oo1.ejercicio11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTest {

	private CuentaCorriente corriente;
	private CajaDeAhorro caja;
	
	@BeforeEach
	void setUp() throws Exception {
		this.corriente = new CuentaCorriente();
		this.corriente.setDescubierto(100);
		this.corriente.depositar(1000);
		this.caja = new CajaDeAhorro();
		this.caja.depositar(1000);
	}

	@Test
	void testExtraer() {
		assertTrue(this.corriente.extraer(500),"sin problema");
		assertTrue(this.corriente.extraer(550),"saldo negativo");
		assertTrue(this.corriente.extraer(50),"caso borde");
		assertFalse(this.corriente.extraer(100),"no puedo extraer este monto");
		assertTrue(this.caja.extraer(500),"sin problema");
		assertEquals(this.caja.getSaldo(),470);
		assertFalse(this.caja.extraer(500),"no puedo extraer este monto");
	}
	
	@Test
	void testDepositar() {
		this.caja.depositar(100);
		assertEquals(this.caja.getSaldo(),1078);
	}
	
	@Test 
	void testTransferirACuenta() {
		this.caja.transferirACuenta(100, corriente);
		assertEquals(this.caja.getSaldo(),878);
		assertEquals(this.corriente.getSaldo(),1100);
		this.corriente.transferirACuenta(200, caja);
		assertEquals(this.caja.getSaldo(),1074);
		assertEquals(this.corriente.getSaldo(),900);
	}

}
