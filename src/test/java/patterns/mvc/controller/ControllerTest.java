
package patterns.mvc.controller;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Unit test Controller class.
 */
public final class ControllerTest {

    /** Provides logging. */
    private static final Logger LOG = LoggerFactory
        .getLogger(ControllerTest.class);

    /**
     * Unit Test to controller.
     *
     */
    @Test
    public void testController() {
        LOG.info("testController");
        final Controller controller = new Controller();
        assertNotNull(controller);
        LOG.info("controller = {}", controller);
    }
}
