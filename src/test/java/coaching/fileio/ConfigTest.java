
package coaching.fileio;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import coaching.fileio.Config.ConfigurationException;

/**
 * Configuration Test Class.
 */
public class ConfigTest {

	private static final Logger LOG = LoggerFactory.getLogger(ConfigTest.class);

	/**
	 * Unit Test to config.
	 *
	 * @throws ConfigurationException the configuration exception
	 */
	@Test
	public void testConfig() throws ConfigurationException {
		// load a properties file.
		final Config config = new Config("example.properties");
		config.setProperty("TIMESTAMP", java.util.Calendar.getInstance().toString());
		LOG.info(config.toString());
	}

	/**
	 * Unit Test to config from properties.
	 *
	 * @throws ConfigurationException the configuration exception
	 */
	@Test
	public void testConfigFromProperties() throws ConfigurationException {
		// System properties used for convenience
		final java.util.Properties systemProperties = System.getProperties();
		// load a properties file.
		final Config config = new Config(systemProperties);
		LOG.info(config.toString());
	}

	/**
	 * Unit Test to config load by file name.
	 *
	 * @throws ConfigurationException the configuration exception
	 */
	@Test
	public void testConfigLoadByFileName() throws ConfigurationException {
		// load a properties file.
		final Config config = new Config();
		config.loadPropertyFile("example.properties");
		LOG.info(config.toString());
	}

	/**
	 * Unit Test to config save properties.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testConfigSaveProperties() throws Exception {
		// System properties used for convenience
		final java.util.Properties systemProperties = System.getProperties();
		// load a properties file.
		final Config config = new Config(systemProperties);
		LOG.info(config.toString());
		config.save("./target/example.properties");
	}

	/**
	 * Unit Test to missing config.
	 *
	 * @throws Exception the exception
	 */
	@Test(expected = ConfigurationException.class)
	public void testMissingConfig() throws Exception {
		// load a properties file.
		new Config("missing");
	}

	/**
	 * Unit Test to missing config properties.
	 *
	 * @throws Exception the exception
	 */
	@Test(expected = ConfigurationException.class)
	public void testMissingConfigProperties() throws Exception {
		// load a properties file.
		new Config("missing.properties");
	}

}
