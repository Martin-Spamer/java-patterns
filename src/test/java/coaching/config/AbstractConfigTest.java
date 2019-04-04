
package coaching.config;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import coaching.resources.ResourceNotLoadedException;
import lombok.extern.slf4j.Slf4j;

/**
 * Unit test for the AbstractConfig object.
 */
@Slf4j
public final class AbstractConfigTest {

    /** The Constant FILENAME_KEY. */
    private static final String FILENAME_KEY = "Filename";

    /** The Constant CONFIG_PROPERTIES. */
    private static final String CONFIG_PROPERTIES = "Configuration.properties";

    /**
     * Mock a MissingConfiguration. The configuration file is missing so throws
     * MissingConfigException.
     */
    public final class MissingConfiguration extends Configuration {
    }

    /**
     * Mock a DefaultConfiguration. When the configuration file is missing,
     * provide default values.
     */
    public final class InvalidConfig extends Configuration {
    }

    /**
     * Unit test to typical usage.
     */
    @Test
    public void testTypicalUsage() {
        log.debug("testTypicalUsage");
        final ConfigInterface config = new Configuration();
        assertNotNull(config);
        log.trace(config.toString());
        assertEquals(CONFIG_PROPERTIES, config.get(FILENAME_KEY));
        verifyProperties(config);
    }

    /**
     * Unit Test with missing property file.
     */
    @Test(expected = ResourceNotLoadedException.class)
    public void testMissingConfig() {
        log.debug("testMissingConfig");
        assertNotNull(new MissingConfiguration());
    }

    /**
     * Unit Test with missing property file.
     */
    @Test(expected = ResourceNotLoadedException.class)
    public void testMissingConfigString() {
        log.debug("testMissingConfigString");
        assertNotNull(new Configuration("Missing"));
    }

    /**
     * Unit Test to system property as override string.
     */
    @Test
    public void testGetSystemProperty() {
        log.debug("testGetSystemProperty");
        final String key = "systemPropertyKey";
        final String expectedValue = "systemPropertyValue";
        System.setProperty(key, expectedValue);
        final ConfigInterface configuration = new Configuration();
        assertNotNull(configuration);
        assertNull(configuration.get(key));
    }

    /**
     * Unit Test to string.
     */
    @Test
    public void testToString() {
        log.debug("testToString");
        final ConfigInterface configuration = new Configuration();
        assertNotNull(configuration);
        final String string = configuration.toString();
        assertNotNull(string);
        log.debug("{}.{}", this.getClass().getSimpleName(), string);
    }

    /**
     * Unit Test to configuration.
     */
    @Test
    public void testConfiguration() {
        log.debug("testConfiguration");
        final ConfigInterface config = new Configuration(CONFIG_PROPERTIES);
        assertNotNull(config);
        log.debug(config.toString());

        assertEquals(CONFIG_PROPERTIES, config.get(FILENAME_KEY));
        verifyProperties(config);
    }

    /**
     * Unit Test to abstract Configuration string.
     */
    @Test
    public void testAbstractConfigStringXml() {
        log.debug("testAbstractConfigStringXml");
        final ConfigInterface config = new Configuration(CONFIG_PROPERTIES);
        assertNotNull(config);
        log.trace(config.toString());

        assertEquals(CONFIG_PROPERTIES, config.get(FILENAME_KEY));
        verifyProperties(config);
    }

    /**
     * Verify properties.
     *
     * @param config the config
     */
    private void verifyProperties(final ConfigInterface config) {
        assertNull(config.get("missing-key"));
        assertEquals("default", config.get("missing-key", "default"));
        assertEquals("value", config.get("key"));
        assertEquals("Value.000", config.get("000"));
        assertEquals("Value.001", config.get("001"));
        assertEquals("Value.002", config.get("002"));
        log.debug(config.toString());
    }

}
