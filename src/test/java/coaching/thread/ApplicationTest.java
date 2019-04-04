
package coaching.thread;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit test class for ThreadedApplication.
 */
@Slf4j
public class ApplicationTest {

    /**
     * Unit test to application.
     */
    @Test
    public void testApplication() {
        assertNotNull(new ThreadedApplication());
    }

}
