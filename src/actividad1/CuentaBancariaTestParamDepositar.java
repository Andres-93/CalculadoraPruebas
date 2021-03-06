package actividad1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class CuentaBancariaTestParamDepositar {

	private int saldo;
	private String password;
	private int esperado;
	private int deposito;
	/*
	 * Debemos crear aparte del atributo con el valor que esperamos, tambien uno para modificar la cantidad que queramos depositar
	 * ya que queremos probar ambos casos.
	 */
	public CuentaBancariaTestParamDepositar(int saldo, String password,int esperado,int deposito) {
		this.saldo = saldo;
		this.password = password;
		this.esperado = esperado;
		this.deposito = deposito;
	}


	@Parameters
	public static Collection<Object[]> numeros(){
		
		return Arrays.asList(new Object[][] { {50,"admin",100,50},{0,"admin",-1,0}});
		
	}

	@Test
	public void testDepositar() {
		
		CuentaBancaria cuenta = new CuentaBancaria(saldo, password);
		int resultado = cuenta.depositar(deposito);
		assertEquals(esperado, resultado);
	}

}
