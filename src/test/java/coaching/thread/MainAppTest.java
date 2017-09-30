
package coaching.thread;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * class MainAppTest.
 */
public class MainAppTest {

	/**
	 * Unit Test to main app.
	 */
	@Test
	public void testMainApp() {
		final MainApp mainApp = new MainApp();
		assertNotNull("Value cannot be null", mainApp);
	}

}
