package ar.edu.unlp.info.oo1.ejercicio14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrismaRectangularTest {

	private PrismaRectangular prisma;
	
	@BeforeEach
	void setUp() throws Exception {
		this.prisma = new PrismaRectangular("Hierro","Azul",8,6,2);
	}

	@Test
	void testGetVolumen() {
		assertEquals(prisma.getVolumen(),96);
	}
	
	@Test 
	void testGetSuperficie() {
		assertEquals(prisma.getSuperficie(),76);
	}

}
