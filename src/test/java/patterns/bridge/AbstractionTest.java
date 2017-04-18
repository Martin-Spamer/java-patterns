package patterns.bridge;

import org.junit.Test;

public class AbstractionTest {

	@Test
	public void testOperation() {
		new RefinedAbstraction(new ImplementorA());
	}

}
