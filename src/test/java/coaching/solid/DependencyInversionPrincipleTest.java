package coaching.solid;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class DependencyInversionPrincipleTest {

	@Test
	public void testDependencyInversionPrinciple() {
		final DependencyInversionPrinciple dip = new DependencyInversionPrinciple();
		assertNotNull("Value cannot be null", dip);
	}

}
