package patterns.mvc.controller;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ControllerTest {

	@Test
	public void testController() throws Exception {
		final Controller controller = new Controller();
		assertNotNull(controller);
	}

}
