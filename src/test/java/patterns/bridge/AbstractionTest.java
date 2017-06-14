
package patterns.bridge;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The AbstractionTest Class.
 */
public class AbstractionTest {

	private static final Logger LOG = LoggerFactory.getLogger(AbstractionTest.class);

	/**
	 * Unit Test to operation.
	 */
	@Test
	public void testOperation() {
		final RefinedAbstraction instance = new RefinedAbstraction(new Implementor());
		assertNotNull(instance);
		LOG.info("{}", instance.toString());
	}

}
