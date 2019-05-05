
package coaching.idioms;

import java.util.UUID;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit test the AbstractLogging class.
 */


@Slf4j
public final class AbstractLoggingTest {

    /**
     * MockLog Class.
     */
    public final class MockLog extends AbstractLogging {

        /*
         * (non-Javadoc)
         * @see coaching.idioms.AbstractLogging#toString()
         */
        @Override
        public String toString() {
            return String.format("%s [bool=%s, num=%s, uuid=%s]", this.getClass().getSimpleName(), this.bool, this.num, this.uuid);
        }

        /** The num. */
        protected int num = Integer.MAX_VALUE;

        /** The bool. */
        protected Boolean bool = true;

        /** The uuid. */
        protected UUID uuid = UUID.randomUUID();
    }

    /**
     * Unit Test Send to log.
     */
    @Test
    public void testSendToLog() {
        final MockLog mockLog = new MockLog();
        assertNotNull(mockLog);
        mockLog.toLog();
    }

    /**
     * Unit Test Send to log.
     */
    @Test
    public void testSendLogTo() {
        final MockLog mockLog = new MockLog();
        assertNotNull(mockLog);
        mockLog.logTo(log);
    }

}
