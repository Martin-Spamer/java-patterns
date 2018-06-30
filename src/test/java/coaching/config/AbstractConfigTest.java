
package coaching.config;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Unit test for Abstract configuration class.
 */
public class AbstractConfigTest {

    private static final String TEST_CONFIG_PROPERTIES = "TestConfig.properties";
    private static final Logger LOG = LoggerFactory.getLogger(AbstractConfigTest.class);

    /**
     * Configuration class.
     */
    public class TestConfig extends AbstractConfig {

        /**
         * Instantiates a new configuration.
         */
        public TestConfig() {
            super();
        }

        /**
         * Instantiates a new configuration.
         *
         * @param configFilename
         *            the config filename
         */
        public TestConfig(final String configFilename) {
            super(configFilename);
        }
    }

    /**
     * Mock a MissingConfiguration.
     * The configuration file is missing so throws MissingConfigException.
     */
    public class MissingConfiguration extends AbstractConfig {
    }

    /**
     * Mock a DefaultConfiguration.
     * When the configuration file is missing, provide default values.
     */
    public class DefaultConfiguration extends AbstractConfig {
    }

    @Test
    public void testTypicalUsage() {
        LOG.debug("testTypicalUsage");
        final TestConfig config = new TestConfig();
        assertNotNull(config);
        LOG.debug(config.toString());
        assertEquals(TEST_CONFIG_PROPERTIES, config.valueFor("File"));
        assertEquals("Value.000", config.valueFor("000"));
        assertEquals("Value.001", config.valueFor("001"));
        assertEquals("Value.002", config.valueFor("002"));
    }

    /**
     * Unit Test with missing property file.
     */
    @Test
    public void testMissingConfig() {
        LOG.debug("testMissingConfig");
        final ConfigInterface configuration = new MissingConfiguration();
        assertNotNull(configuration);
    }

    /**
     * Unit Test with missing property file.
     */
    @Test
    public void testMissingConfigString() {
        LOG.debug("testMissingConfigString");
        final ConfigInterface configuration = new TestConfig("Missing");
        assertNotNull(configuration);
    }

    /**
     * Unit Test to abstract configuration.
     */
    @Test
    public void testAbstractConfig() {
        LOG.debug("testAbstractConfig");
        final ConfigInterface config = new TestConfig();
        assertNotNull(config);
        LOG.debug(config.toString());

        assertEquals(TEST_CONFIG_PROPERTIES, config.getProperty("propertyFilename"));
        assertEquals("value", config.getProperty("key"));
        assertEquals("Value.000", config.getProperty("000"));
        assertEquals("Value.001", config.getProperty("001"));
        assertEquals("Value.002", config.getProperty("002"));
        assertEquals("default", config.getProperty("missing-key", "default"));
    }

    /**
     * Unit Test to abstract Configuration string.
     */
    @Test
    public void testAbstractConfigString() {
        LOG.debug("testAbstractConfigString");
        final ConfigInterface config = new TestConfig("Configuration");
        assertNotNull(config);
        LOG.debug(config.toString());

        assertEquals("Configuration.properties", config.getProperty("propertyFilename"));
        assertEquals("value", config.getProperty("key"));
        assertEquals("Value.000", config.getProperty("000"));
        assertEquals("Value.001", config.getProperty("001"));
        assertEquals("Value.002", config.getProperty("002"));
        assertEquals("default", config.getProperty("missing-key", "default"));
    }

    /**
     * Unit Test to get property string.
     */
    @Test
    public void testGetPropertyString() {
        LOG.debug("testGetPropertyString");
        final ConfigInterface config = new TestConfig();
        assertNotNull(config);
        LOG.debug(config.toString());

        assertEquals(TEST_CONFIG_PROPERTIES, config.getProperty("propertyFilename"));
        assertEquals("value", config.getProperty("key"));
        assertEquals("Value.000", config.getProperty("000"));
        assertEquals("Value.001", config.getProperty("001"));
        assertEquals("Value.002", config.getProperty("002"));
        assertEquals("default", config.getProperty("missing-key", "default"));
    }

    /**
     * Unit Test to get property string with default.
     */
    @Test
    public void testGetPropertyStringDefault() {
        LOG.debug("testGetPropertyStringDefault");
        final ConfigInterface config = new TestConfig();
        assertNotNull(config);
        LOG.debug(config.toString());

        assertEquals(TEST_CONFIG_PROPERTIES, config.getProperty("propertyFilename"));
        assertEquals("value", config.getProperty("key"));
        assertEquals("Value.000", config.getProperty("000"));
        assertEquals("Value.001", config.getProperty("001"));
        assertEquals("Value.002", config.getProperty("002"));
        assertEquals("default", config.getProperty("missing-key", "default"));
    }

    /**
     * Unit Test to get property string.
     */
    @Test
    public void testGetSystemProperty() {
        LOG.debug("testGetSystemProperty");
        System.setProperty("systemPropertyKey", "systemPropertyValue");
        final ConfigInterface configuration = new TestConfig();
        assertNotNull(configuration);
        assertEquals("systemPropertyValue", configuration.getProperty("systemPropertyKey"));
    }

    /**
     * Unit Test to string.
     */
    @Test
    public void testToString() {
        LOG.debug("testToString");
        final ConfigInterface configuration = new TestConfig();
        assertNotNull(configuration);
        final String string = configuration.toString();
        assertNotNull(string);
        LOG.debug("{}.{}", this.getClass().getSimpleName(), string);
    }

    /**
     * Unit Test to configuration.
     */
    @Test
    public void testConfiguration() {
        LOG.debug("testConfiguration");
        final TestConfig config = new TestConfig(TEST_CONFIG_PROPERTIES);
        assertNotNull(config);
        LOG.debug(config.toString());

        assertEquals(TEST_CONFIG_PROPERTIES, config.valueFor("File"));
        assertEquals("Value.000", config.valueFor("000"));
        assertEquals("Value.001", config.valueFor("001"));
        assertEquals("Value.002", config.valueFor("002"));
    }

}
