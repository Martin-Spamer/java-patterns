
package coaching.logging;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Unit test for the StaticLogging example class.
 */
public final class StaticLoggingTest {

    /** Provides logging. */
    private static final Logger LOG = LoggerFactory
        .getLogger(StaticLoggingTest.class);

    /**
     * Unit Test to send to log.
     */
    @Test
    public void testSendToLog() {
        new StaticLogging().toLog();
    }

    /**
     * Unit Test to send log to.
     */
    @Test
    public void testSendLogTo() {
        new StaticLogging().logTo(LOG);
    }

}
