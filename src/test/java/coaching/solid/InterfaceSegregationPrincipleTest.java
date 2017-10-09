package coaching.solid;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class InterfaceSegregationPrincipleTest {

	@Test
	public void testInterfaceSegregationPrinciple() {
		final InterfaceSegregationPrinciple isp = new InterfaceSegregationPrinciple();
		assertNotNull("Value cannot be null", isp);
	}

}
