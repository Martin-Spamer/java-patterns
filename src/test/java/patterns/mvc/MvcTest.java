package patterns.mvc;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import patterns.mvc.controller.Controller;
import patterns.mvc.model.Model;
import patterns.mvc.view.View;

public class MvcTest {

	@Test
	public void testMvc() throws Exception {
		final Model model = new Model();
		assertNotNull(model);

		final View view = new View();
		assertNotNull(view);

		final Controller controller = new Controller();
		assertNotNull(controller);
	}

	@Test
	public void runMvc() throws Exception {
		final Model model = new Model();
		final View view = new View();
		model.attach("view", view);

		/**
		 * create Controller. add Model and View, initialise model
		 */
		final Controller controller = new Controller();
		controller.attachModel(model);
		controller.attachView(view);
		controller.execute("Test");
	}
}
