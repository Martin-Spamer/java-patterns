package delegation;

import org.junit.Test;

public class ManagerTest {

	@Test
	public void testDelegation() {
		Manager manager = new Manager();
		Worker worker = new Worker();
		manager.setWorker(worker);
		manager.doProcess();
	}

}
