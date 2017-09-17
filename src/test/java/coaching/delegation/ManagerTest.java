package coaching.delegation;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.*;

/**
 * Manager Test.
 */
public class ManagerTest {

	private static final Logger LOG = LoggerFactory.getLogger(ManagerTest.class);

	/**
	 * Test delegation.
	 */
	@Test
	public void testDelegation() {
		LOG.info("testDelegation");
		final Manager manager = new Manager();
		assertNotNull(manager);

		final Worker worker = new Worker();
		assertNotNull(manager);

		assertNotNull(manager.setWorker(worker));
		assertNotNull(manager.doProcess());
	}

}
