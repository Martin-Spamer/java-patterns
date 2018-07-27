
package coaching.wip;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Unit tests showing retrieval of system properties.
 */
public final class EnvironmentTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory
        .getLogger(EnvironmentTest.class);

    /**
     * Unit test to log system properties.
     */
    @Test
    public void testLogSystemProperties() {
        LOG.info("SystemProperties = {}", System.getProperties());
    }

}
