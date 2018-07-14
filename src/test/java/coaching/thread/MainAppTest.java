
package coaching.thread;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Unit tests for MainApp.
 */
public final class MainAppTest {

    private static final Logger LOG = LoggerFactory.getLogger(MainAppTest.class);

    @Test
    public void testMainApp() {
        final Application mainApp = new Application();
        assertNotNull(mainApp);
    }

}
