package actividad1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class CuentaBancariaTestParamRetirar {

	private int saldo;
	private String password;
	private int esperado;
	private int retiro;
	/*
	 * Debemos crear aparte del atributo con el valor que esperamos, tambien uno para modificar la cantidad que queramos retirar
	 * ya que queremos todos los casos
	 */
	public CuentaBancariaTestParamRetirar(int saldo, String password,int esperado,int retiro) {
		this.saldo = saldo;
		this.password = password;
		this.esperado = esperado;
		this.retiro = retiro;
	}


	@Parameters
	public static Collection<Object[]> numeros(){
		
		return Arrays.asList(new Object[][] { {100,"admin",-1,150},{100,"admin",50,50},{100,"armin",-2,0}});
		
	}

	@Test
	public void testDepositar() {
		
		CuentaBancaria cuenta = new CuentaBancaria(saldo, "admin");
		int resultado = cuenta.retirar(retiro, password);
		assertEquals(esperado, resultado);
	}

}
