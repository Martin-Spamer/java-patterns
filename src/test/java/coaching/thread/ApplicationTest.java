
package coaching.thread;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Unit test class for ThreadedApplication.
 */
public class ApplicationTest {

    /**
     * Unit test to application.
     */
    @Test
    public void testApplication() {
        assertNotNull(new ThreadedApplication());
    }

}
