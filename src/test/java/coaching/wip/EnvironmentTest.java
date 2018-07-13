
package coaching.wip;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Unit tests showing retrieval of system properties.
 */
public final class EnvironmentTest {

    private static final Logger LOG = LoggerFactory.getLogger(EnvironmentTest.class);

    @Test
    public void testLogSystemProperties() {
        LOG.info("SystemProperties = {}", System.getProperties());
    }

}
