


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
		assertNotNull("Value cannot be null", model);

		final View view = new View();
		assertNotNull("Value cannot be null", view);

		final Controller controller = new Controller();
		assertNotNull("Value cannot be null", controller);
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
		assertNotNull("Value cannot be null", execute);
	}
}
