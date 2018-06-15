
package coaching.thread;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * class MainAppTest.
 */
public class MainAppTest {

    /**
     * Unit Test to main app.
     */
    @Test
    public void testMainApp() {
        final Application mainApp = new Application();
        assertNotNull("Value cannot be null", mainApp);
    }

}
