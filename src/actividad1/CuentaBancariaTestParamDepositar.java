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
	
	public CuentaBancariaTestParamDepositar(int saldo, String password) {
		super();
		this.saldo = saldo;
		this.password = password;
	}


	@Parameters
	public static Collection<Object[]> numeros(){
		
		return Arrays.asList(new Object[][] { {5,5,10},{20,30,50},{30,-2, 28},{5,2,7}});
		
	}




	@Test
	public void testDepositar() {
		fail("Not yet implemented");
	}

}
