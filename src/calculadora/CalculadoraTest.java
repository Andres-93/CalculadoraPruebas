package calculadora;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

	
	Calculadora pete;
	
	@Before
	public void creaCalculadora() {
		pete = new Calculadora(20,30);
		System.out.println("Inicio prueba");
		
	}
	@After
	public void creaCalculadora2() {
		
		System.out.println("Fin de la prueba");
		
	}
	
	
	@Test
	public void testSuma() {

		int num = pete.suma();	
		assertEquals(50,num);
		
		
	}

	@Test
	public void testResta() {

		int num = pete.resta();	
		assertEquals(10,num);		
	}
	
	@Test
	public void testNum1EsMayor() {

		boolean resultado = pete.num1EsMayor();
		
		//assertEquals(false,resultado)
		//assertTrue("no es verdadero,resultado)
		//En este caso el valor esperado es false, si buscaramos un ture usariamos el assertTrue
		assertFalse(resultado);
		
		
	}

	@Test
	public void testMultiplicacion() {
		int num = pete.multiplicacion();	
		assertEquals("fallo en la multiplicacion",600,num);
	}

	@Test
	public void testDivision() {
		int num = pete.division();	
		assertEquals("fallo en la division",0,num);
	}
	
	@Test
	public void testDivision2() {
		Integer resultado = pete.division2();
		assertNotNull(resultado);
		
	}
	
	@Test
	public void testDivisionPorCero() {
		int num = 0;
		try {
			 num = pete.division();	
		}catch(ArithmeticException error) {
			System.out.println(error.getMessage());
			fail(("FALLO, deberia haber lanzado la excepcion"));
		}	
	}
	/*
	@Test(expected = java.lang.ArithmeticException.class)
	public void testDivision3() {	
		int num = pete.division3();
		
		
	}
	*/
	
}
	


