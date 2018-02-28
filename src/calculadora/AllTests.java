package calculadora;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CalculadoraTestDiv.class, CalculadoraTestParam.class,
		CalculadoraTestParamMult.class, CalculadoraTestParamResta.class })
public class AllTests {

}
