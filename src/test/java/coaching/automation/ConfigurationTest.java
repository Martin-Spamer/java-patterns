
package coaching.automation;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

import coaching.config.AbstractConfiguration;
import coaching.config.Configuration;

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
        AbstractConfiguration config = new Configuration();
        assertNotNull(config);
        LOG.info(config.toString());
    }

}
