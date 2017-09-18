package patterns.mvc;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import patterns.mvc.controller.*;
import patterns.mvc.model.Model;
import patterns.mvc.view.View;

/**
 * Model View Controller Test Class.
 */
public class MvcTest {

	/**
	 * Unit Test to mvc.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testMvc() throws Exception {
		final Model model = new Model();
		assertNotNull(model);

		final View view = new View();
		assertNotNull(view);

		final Controller controller = new Controller();
		assertNotNull(controller);
	}

	/**
	 * Test run the MVC pattern.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void tesrRunMvc() throws Exception {
		final Model model = new Model();
		final View view = new View();
		model.attach("view", view);

		/**
		 * create Controller.
		 * Add Model and View,
		 * initialise model
		 */
		final Controller controller = new Controller();
		controller.attachModel(model);
		controller.attachView(view);
		final AbstractController execute = controller.execute("ExampleCommand");
		assertNotNull(execute);
	}
}
