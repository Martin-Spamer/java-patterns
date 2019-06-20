
package coaching.config;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit tests for Configuration class.
 */


/** The Constant 			log. */
@Slf4j
public final class ConfigurationTest {

    /**
     * Test configuration.
     */
    @Test
    public void testConfiguration() {
        final Configuration config = new Configuration();
        assertNotNull(config);
        log.info(config.toString());
        config.valueFor("Missing");
        config.valueFor("Missing", "default");
    }

    /**
     * Unit Test to configuration.
     */
    @Test
    public void testConfiguration2() {
        final Configuration config = new Configuration();
        assertNotNull(config);
        assertEquals(null, config.valueFor("missing"));
        assertEquals("Configuration.properties", config.valueFor("Filename"));
        assertEquals("Value.000", config.valueFor("000"));
        assertEquals("Value.001", config.valueFor("001"));
        assertEquals("Value.002", config.valueFor("002"));
        log.info(config.toString());
    }

}
