
package javamentor.delegation;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ManagerTest.
 */
public class ManagerTest {

	private static final Logger LOG = LoggerFactory.getLogger(ManagerTest.class);

	/**
	 * Test delegation.
	 */
	@Test
	public void testDelegation() {
		final Manager manager = new Manager();
		final Worker worker = new Worker();
		manager.setWorker(worker);
		manager.doProcess();
	}

}
