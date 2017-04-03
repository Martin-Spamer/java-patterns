
package delegation;

import org.junit.Test;

/**
 * The Class ManagerTest.
 */
public class ManagerTest {

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
