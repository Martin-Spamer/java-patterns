
package coaching.thread;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit tests for MainApp.
 */


@Slf4j
public final class MainAppTest {

    /**
     * Unit test to main app.
     */
    @Test
    public void testMainApp() {
        final ThreadedApplication mainApp = new ThreadedApplication();
        assertNotNull(mainApp);
    }

}
