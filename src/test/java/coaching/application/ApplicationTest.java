
package coaching.application;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit test class for Application.
 */
public class ApplicationTest {

    /**
     * Unit test to application.
     */
    @Test
    public void testApplication() {
        assertTrue(new Application().execute());
    }

    /**
     * Unit test to application args.
     */
    @Test
    public void testApplicationArgs() {
        String[] args = new String[0];
        assertTrue(new Application(args).execute());
    }

    /**
     * Unit test to application main.
     */
    @Test
    public void testApplicationMain() {
        String[] args = new String[0];
        Application.main(args);
    }

    /**
     * Unit test to application main with arguments.
     */
    @Test
    public void testApplicationMainArgs() {
        String[] args = { "Application.config" };
        Application.main(args);
    }
}
