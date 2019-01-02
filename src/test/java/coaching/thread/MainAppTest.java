
package coaching.thread;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Unit tests for MainApp.
 */
public final class MainAppTest {

    /**
     * Unit test to main app.
     */
    @Test
    public void testMainApp() {
        final Application mainApp = new Application();
        assertNotNull(mainApp);
    }

}
