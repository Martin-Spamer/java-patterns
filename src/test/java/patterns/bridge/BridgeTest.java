
package patterns.bridge;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.*;

/**
 * BridgeTest Class.
 */
public class BridgeTest {

	private static final Logger LOG = LoggerFactory.getLogger(BridgeTest.class);

	/**
	 * Unit Test to operation.
	 */
	@Test
	public void testOperation() {
		final RefinedAbstraction instance = new RefinedAbstraction(new Implementor());
		assertNotNull("Value cannot be null", instance);
		LOG.info("{}", instance.toString());
	}

}
