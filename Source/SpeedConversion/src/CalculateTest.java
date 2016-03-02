import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateTest {
	
	Calculate object = new Calculate();
	double result = object.kmphToMps(36.0);
	double testresult = 10.0;

	@Test
	public void test() {
		System.out.println("@Test Result() : "+result+" = "+testresult);
		assertEquals(result,testresult,0);
	}

}
