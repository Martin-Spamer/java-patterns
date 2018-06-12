
package patterns.mvc;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import patterns.mvc.controller.AbstractController;
import patterns.mvc.controller.Controller;
import patterns.mvc.model.Model;
import patterns.mvc.view.View;

/**
 * Model View Controller Test Class.
 */
public class MvcTest {

	/**
	 * Unit Test to mvc.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@Test
	public void testModel() throws Exception {
		final Model model = new Model();
		assertNotNull("model cannot be null", model);
	}

	@Test
	public void testView() throws Exception {
		final View view = new View();
		assertNotNull("View cannot be null", view);
	}

	@Test
	public void testController() throws Exception {
		final Controller controller = new Controller();
		assertNotNull("Controller cannot be null", controller);
	}

	/**
	 * Test run the MVC pattern. create Controller. Add Model and View, initialise
	 * model.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@Test
	public void testRunMvc() throws Exception {
		final Model model = new Model();
		assertNotNull("model cannot be null", model);

		final View view = new View();
		assertNotNull("view cannot be null", view);

		final Controller controller = new Controller();
		assertNotNull("controller  cannot be null", controller);

		controller.attachModel(model);
		controller.attachView(view);
		final AbstractController execute = controller.execute("ExampleCommand");
		assertNotNull("execute cannot be null", execute);
	}
}
