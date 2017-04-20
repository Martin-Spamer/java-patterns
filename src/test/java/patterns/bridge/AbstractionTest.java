package patterns.bridge;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AbstractionTest {

	private static final Logger LOG = LoggerFactory.getLogger(AbstractionTest.class);

	@Test
	public void testOperation() {
		new RefinedAbstraction(new ImplementorA());
	}

}
