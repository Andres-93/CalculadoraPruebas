package calculadora;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculadoraTestDiv {

	private int num1,num2;
	Integer resultado;	

	public CalculadoraTestDiv(int num1, int num2, Integer resultado) {
		this.num1 = num1;
		this.num2 = num2;
		this.resultado = resultado;
	}

	@Parameters
	public static Collection<Object[]> numeros(){
		
		return Arrays.asList(new Object[][] { {5,5,1},{10,2,5},{30,2, 15},{10,0,null}});
		
	}
	
	@Test
	public void testDivision2() {
		
		Calculadora calc = new Calculadora(num1,num2);
		Integer resultadoReal = calc.division2();
		assertEquals(resultado, resultadoReal);
	}

}
