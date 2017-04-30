package patterns.bridge;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AbstractionTest {

	private static final Logger LOG = LoggerFactory.getLogger(AbstractionTest.class);

	@Test
	public void testOperation() {
		final RefinedAbstraction instance = new RefinedAbstraction(new Implementor());
		assertNotNull(instance);
		LOG.info("{}", instance.toString());
	}

}
