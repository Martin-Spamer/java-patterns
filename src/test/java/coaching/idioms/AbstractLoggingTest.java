
package coaching.idioms;

import java.util.UUID;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Unit test the AbstractLogging class.
 */
public class AbstractLoggingTest {

    /** The Constant LOG. */
    private static final Logger LOG = LoggerFactory.getLogger(AbstractLoggingTest.class);
    
    /** The log. */
    protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

    /**
     * MockLog Class.
     */
    public final class MockLog extends AbstractLogging {
        
        /* (non-Javadoc)
         * @see coaching.idioms.AbstractLogging#toString()
         */
        @Override
        public String toString() {
            return String.format("%s [bool=%s, num=%s, uuid=%s]",
                    this.getClass().getSimpleName(),
                    this.bool,
                    this.num,
                    this.uuid);
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
        mockLog.logTo(LOG);
        mockLog.logTo(this.log);
    }

}
