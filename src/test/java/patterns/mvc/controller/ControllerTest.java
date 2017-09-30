
package patterns.mvc.controller;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * The ControllerTest Class.
 */
public class ControllerTest {

	/**
	 * Unit Test to controller.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testController() throws Exception {
		final Controller controller = new Controller();
		assertNotNull("Value cannot be null", controller);
	}
}
