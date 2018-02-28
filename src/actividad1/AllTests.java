package actividad1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CuentaBancariaTest.class, CuentaBancariaTestParamDepositar.class,
		CuentaBancariaTestParamRetirar.class })
public class AllTests {

}
