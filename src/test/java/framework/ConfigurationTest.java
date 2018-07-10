
package framework;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

import coaching.config.Configuration;

public class ConfigurationTest {

    private static final Logger LOG = LoggerFactory.getLogger(ConfigurationTest.class);

    /**
     * Test configuration.
     */
    @Test
    public void testConfiguration() {
        Configuration config = new Configuration();
        assertNotNull(config);
        LOG.info(config.toString());
    }

}
