package calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSuma() {
		Calculadora pete = new Calculadora(20,30);
		int num = pete.suma();	
		assertEquals(50,num);
		
		
	}

	@Test
	public void testResta() {
		Calculadora pete = new Calculadora(20,30);
		int num = pete.resta();	
		assertEquals(-10,num);
		
	}

	@Test
	public void testMultiplicacion() {
		Calculadora pete = new Calculadora(20,30);
		int num = pete.multiplicacion();	
		assertEquals("fallo en la multiplicacion",600,num);
	}

	@Test
	public void testDivision() {
		Calculadora pete = new Calculadora(8,2);
		int num = pete.division();	
		assertEquals("fallo en la division",4,num);
	}
	
	@Test
	public void testDivisionPorCero() {
		Calculadora pete = new Calculadora(8,0);
		int num = 0;
		try {
			 num = pete.division();	
			fail(("FALLO, deberia haber lanzado la excepcion"));
		}catch(ArithmeticException error) {
			System.out.println(error.getMessage());
		}

	
	}
}
	


