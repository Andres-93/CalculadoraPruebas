package actividad1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CuentaBancariaTestVersionProfe {

	CuentaBancaria banco;
	
	@Before
	public void inicioPruebas() {
		banco = new CuentaBancaria(100, "admin1234");			
	}
	//El before class debe ser estatico
	@After
	public void final2() {
		
		banco = null;
		
	}
		
	@Test
	public void testDepositar() {		
		assertEquals(200, banco.depositar(100));
	}
	
	@Test
	public void testDepositar_Nocorrecto() {	
		assertEquals(-1, banco.depositar(0));
	}

	@Test
	public void testRetirar1() {	
		assertEquals(50,banco.retirar(50, "admin1234"));
	}
	
	@Test
	public void testRetirar2() {
		assertEquals(-1,banco.retirar(200, "admin1234"));	
	}
	
	@Test
	public void testRetirar3() {
		assertEquals(-2,banco.retirar(50, "coco"));
	}

	@Test
	public void testPasswordCorrecta() {
		assertTrue( banco.passwordCorrecta("admin1234"));
	}
	
	@Test
	public void testPasswordCorrecta2() {
		assertFalse( banco.passwordCorrecta("admin"));
	}

}
