package actividad1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CuentaBancariaTest {

	
	@BeforeClass
	public void crearCuentaBancaria() {
		
		CuentaBancaria cuenta = new CuentaBancaria(1000, "admin1234");
		
	}
	
	
	@Test
	public void testDepositar() {
		
		fail("Not yet implemented");
	}

	@Test
	public void testRetirar() {
		fail("Not yet implemented");
	}

	@Test
	public void testPasswordCorrecta() {
		fail("Not yet implemented");
	}

}
