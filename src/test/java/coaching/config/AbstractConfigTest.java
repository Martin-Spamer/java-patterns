

package coaching.config;

import static org.junit.Assert.*;

import org.junit.Test;
import org.slf4j.*;

/**
 * Unit test for Abstract configuration class.
 */
public class AbstractConfigTest {

	private static final Logger LOG = LoggerFactory.getLogger(AbstractConfigTest.class);

	/**
	 * Configuration class.
	 */
	public class Configuration extends AbstractConfig {

		/**
		 * Instantiates a new configuration.
		 */
		public Configuration() {
			super();
		}

		/**
		 * Instantiates a new configuration.
		 *
		 * @param configFilename the config filename
		 */
		public Configuration(final String configFilename) {
			super(configFilename);
		}
	}

	/**
	 * class MissingConfiguration.
	 */
	public class MissingConfiguration extends AbstractConfig {
	}

	/**
	 * Unit Test with missing property file.
	 */
	@Test
	public void testMissingConfig() {
		LOG.info("testMissingConfig");
		final ConfigInterface configuration = new MissingConfiguration();
		assertNotNull("Value cannot be null", configuration);
	}

	/**
	 * Unit Test with missing property file.
	 */
	@Test
	public void testMissingConfigString() {
		LOG.info("testMissingConfigString");
		final ConfigInterface configuration = new Configuration("Missing");
		assertNotNull("Value cannot be null", configuration);
	}

	/**
	 * Unit Test to abstract configuration.
	 */
	@Test
	public void testAbstractConfig() {
		LOG.info("testAbstractConfig");
		final ConfigInterface configuration = new Configuration();
		assertNotNull("Value cannot be null", configuration);
		final String filename = configuration.getProperty("propertyFilename");
		assertEquals("Configuration.properties", filename);

		final String value = configuration.getProperty("key");
		assertNotNull("Value cannot be null", value);
		assertEquals("value", value);
	}

	/**
	 * Unit Test to abstract Configuration string.
	 */
	@Test
	public void testAbstractConfigString() {
		LOG.info("testAbstractConfigString");
		final ConfigInterface configuration = new Configuration("Configuration");
		assertNotNull("Value cannot be null", configuration);
		final String filename = configuration.getProperty("propertyFilename");
		assertEquals("Configuration.properties", filename);

		final String value = configuration.getProperty("key");
		assertNotNull("Value cannot be null", value);
		assertEquals("value", value);
	}

	/**
	 * Unit Test to get property string.
	 */
	@Test
	public void testGetPropertyString() {
		LOG.info("testGetPropertyString");
		final ConfigInterface configuration = new Configuration();
		final String filename = configuration.getProperty("propertyFilename");
		assertNotNull("Value cannot be null", configuration);
		assertEquals("Configuration.properties", filename);

		final String value = configuration.getProperty("key");
		assertNotNull("Value cannot be null", value);
		assertEquals("value", value);
	}

	/**
	 * Unit Test to get property string with default.
	 */
	@Test
	public void testGetPropertyStringDefault() {
		LOG.info("testGetPropertyStringDefault");
		final ConfigInterface configuration = new Configuration();
		assertNotNull("Value cannot be null", configuration);
		final String filename = configuration.getProperty("propertyFilename");
		assertEquals("Configuration.properties", filename);

		final String value = configuration.getProperty("missing-key", "default");
		assertNotNull("Value cannot be null", value);
		assertEquals("default", value);
	}

	/**
	 * Unit Test to get property string.
	 */
	@Test
	public void testGetSystemProperty() {
		LOG.info("testGetSystemProperty");
		final ConfigInterface configuration = new Configuration();
		assertNotNull("Value cannot be null", configuration);
		final String filename = configuration.getProperty("propertyFilename");
		assertEquals("Configuration.properties", filename);

		final String value = configuration.getProperty("missing-key", "default");
		assertNotNull("Value cannot be null", value);
		assertEquals("default", value);
	}

	/**
	 * Unit Test to string.
	 */
	@Test
	public void testToString() {
		LOG.info("testToString");
		final ConfigInterface configuration = new Configuration();
		assertNotNull("Value cannot be null", configuration);
		final String string = configuration.toString();
		assertNotNull("Value cannot be null", string);
		LOG.info("{}", string);
		final String value = configuration.getProperty("key");
		assertNotNull("Value cannot be null", value);
		assertEquals("value", value);
	}

	/**
	 * Unit Test to configuration.
	 */
	@Test
	public void testConfiguration() {
		final Configuration config = new Configuration();
		assertNotNull("Value cannot be null", config);
		LOG.info("{}", config.toString());
		assertEquals("Configuration.properties", config.valueFor("File"));
		assertEquals("Java Coaching", config.valueFor("Project"));
		assertEquals("Value.000", config.valueFor("000"));
		assertEquals("Value.001", config.valueFor("001"));
		assertEquals("Value.002", config.valueFor("002"));
	}

}
