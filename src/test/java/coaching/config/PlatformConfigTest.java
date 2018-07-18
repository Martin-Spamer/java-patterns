
package coaching.config;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

public class PlatformConfigTest {

    private static final Logger LOG = LoggerFactory
        .getLogger(PlatformConfigTest.class);

    @Test
    public void testPlatformConfig() {
        final PlatformConfig config = new PlatformConfig();
        assertNotNull(config);
        LOG.info("{}", config.toString());
    }

}
