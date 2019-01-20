
package coaching.config;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Unit tests for Configuration class.
 */
public final class ConfigurationTest {

    /** Provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(ConfigurationTest.class);

    /**
     * Test configuration.
     */
    @Test
    public void testConfiguration() {
        final Configuration config = new Configuration();
        assertNotNull(config);
        LOG.info(config.toString());
        config.valueFor("Missing");
        config.valueFor("Missing", "default");
    }

}
