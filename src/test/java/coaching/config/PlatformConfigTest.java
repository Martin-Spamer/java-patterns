
package coaching.config;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Unit test class for PlatformConfig.
 */
public class PlatformConfigTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(PlatformConfigTest.class);

    /**
     * Unit test platform configuration.
     */
    @Test
    public void testPlatformConfig() {
        final PlatformConfig config = new PlatformConfig();
        assertNotNull(config);
        LOG.info("{}", config.toString());
    }

}
