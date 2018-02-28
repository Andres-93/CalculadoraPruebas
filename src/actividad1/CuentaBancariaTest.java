package actividad1;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CuentaBancariaTest {

	static CuentaBancaria cuenta;
	
	@BeforeClass
	public static void crearCuentaBancaria() {
		
		cuenta = new CuentaBancaria(0, "admin1234");
		System.out.println("Inicio de las pruebas");
	}
	
	@AfterClass
	public static void crearCuentaBancaria2() {
		System.out.println("Fin de las pruebas.");
		cuenta = null;
	}
	
	@Test
	public void testDepositar() {		
		int num = cuenta.depositar(100);		
		assertEquals(100,num );		
	}
	
	@Test
	public void testDepositar1() {		
		int num = cuenta.depositar(0);		
		assertEquals(-1,num );		
	}

	@Test
	public void testRetirar() {
		cuenta = new CuentaBancaria(0, "admin1234");
		int num = cuenta.retirar(50, "admin1234");
		assertEquals(-1, num);		
	}
	
	@Test
	public void testRetirar2() {	
		cuenta = new CuentaBancaria(100, "admin1234");
		int num = cuenta.retirar(50, "admin1234");
		assertEquals(50, num);		
	}
	
	@Test
	public void testRetirar3() {		
		int num = cuenta.retirar(50, "admin");
		assertEquals(-2, num);		
	}
	
	@Test
	public void testPasswordCorrecta(){
		boolean resultado = cuenta.passwordCorrecta("admin1234");
		assertTrue(resultado);
	}
	
	@Test
	public void testPasswordCorrecta2(){
		boolean resultado = cuenta.passwordCorrecta("admin");
		assertFalse(resultado);
	}


	
}
