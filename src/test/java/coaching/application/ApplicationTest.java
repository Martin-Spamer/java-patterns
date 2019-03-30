
package coaching.application;

import org.junit.Test;

/**
 * Unit test class for ThreadedApplication.
 */
public class ApplicationTest {

    /**
     * Unit test to application.
     */
    @Test
    public void testApplication() {
        new Application().execute();
    }

    /**
     * Unit test to application args.
     */
    @Test
    public void testApplicationArgs() {
        new Application(new String[0]).execute();
    }

    @Test
    public void testApplicationNullArgs() {
        new Application(null).execute();
    }

    /**
     * Unit test to application main with arguments.
     */
    @Test
    public void testApplicationMainArgs() {
        String[] args = { "ThreadedApplication.config" };
        Application.main(args);
    }

    @Test
    public void testApplicationMain() {
        String[] args = new String[0];
        Application.main(args);
    }

    @Test
    public void testApplicationMainNull() {
        String[] args = null;
        Application.main(args);
    }

}
