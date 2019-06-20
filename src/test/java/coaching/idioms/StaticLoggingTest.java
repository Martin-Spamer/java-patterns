
package coaching.idioms;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit tests showing StaticLogging example.
 */


/** The Constant 			log. */
@Slf4j
public final class StaticLoggingTest {

    /**
     * Unit Test to send to log.
     */
    @Test
    public void testSendToLog() {
        assertNotNull(log);
    }

}
