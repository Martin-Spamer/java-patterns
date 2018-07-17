
package patterns.mvc;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import patterns.command.MissingCommandException;
import patterns.mvc.controller.Controller;
import patterns.mvc.model.AbstractModel;
import patterns.mvc.model.Model;
import patterns.mvc.view.AbstractView;
import patterns.mvc.view.View;

/**
 * Model View Controller Test class.
 */
public final class MvcTest {

    /** Provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(MvcTest.class);

    /**
     * Unit Test the MVC Model class.
     */
    @Test
    public void testModel() {
        LOG.info("testModel()");
        final AbstractModel model = new Model();
        assertNotNull("Model cannot be null", model);
        assertEquals(model, model.update());
    }

    /**
     * Unit Test the MVC View class.
     */
    @Test
    public void testView() {
        LOG.info("testView()");
        final AbstractView view = new View();
        assertNotNull("View cannot be null", view);
        assertEquals(view, view.show());
    }

    /**
     * Unit Test the MVC Controller class.
     *
     * @throws MissingCommandException the missing command exception
     */
    @Test
    public void testController() throws MissingCommandException {
        LOG.info("testController()");
        final Controller controller = new Controller();
        assertNotNull("Controller cannot be null", controller);
        assertNotNull(controller.execute());
    }

    /**
     * Test run the MVC pattern. create Controller. Add Model and View,
     * initialise
     * model.
     *
     * @throws MissingCommandException the missing command exception
     */
    @Test
    public void testBuildMvc() throws MissingCommandException {
        LOG.info("testBuildMvc()");

        final ControllerInterface controller = new Controller();
        assertNotNull("controller  cannot be null", controller);

        final ControllerInterface execute = controller
            .execute("ExampleCommand");
        assertNotNull("execute cannot be null", execute);
    }

    /**
     * Unit test to setup mvc.
     *
     * @throws MissingCommandException the missing command exception
     */
    @Test
    public void testSetupMvc() throws MissingCommandException {
        LOG.info("testSetupMvc()");

        final ControllerInterface controller = new Controller();
        assertNotNull("controller  cannot be null", controller);

        final AbstractModel model = new Model();
        assertNotNull("Model cannot be null", model);
        assertEquals(controller, controller.attachModel(model));

        final AbstractView view = new View();
        assertNotNull("view cannot be null", view);
        assertEquals(controller, controller.attachView(view));

        final ControllerInterface execute = controller
            .execute("ExampleCommand");
        assertNotNull("execute cannot be null", execute);
    }

    /**
     * Unit test to mvc constructor.
     *
     * @throws MissingCommandException the missing command exception
     */
    @Test
    public void testMvcConstructor() throws MissingCommandException {
        LOG.info("testMvcConstructor()");

        final AbstractModel model = new Model();
        assertNotNull("Model cannot be null", model);

        final AbstractView view = new View();
        assertNotNull("view cannot be null", view);

        final ControllerInterface controller = new Controller(model, view);
        assertNotNull("controller  cannot be null", controller);

        final ControllerInterface execute = controller
            .execute("ExampleCommand");
        assertNotNull("execute cannot be null", execute);
    }

}
