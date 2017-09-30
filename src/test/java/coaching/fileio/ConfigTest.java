
package coaching.fileio;

import static org.junit.Assert.assertNotNull;

import java.util.*;

import org.junit.Test;
import org.slf4j.*;

import coaching.fileio.Config.ConfigurationException;

/**
 * Configuration Test Class.
 */
public class ConfigTest {

	private static final Logger LOG = LoggerFactory.getLogger(ConfigTest.class);

	/**
	 * Unit Test for configuration.
	 *
	 * @throws ConfigurationException the configuration exception
	 */
	@Test
	public void testConfig() throws ConfigurationException {
		// load a properties file.
		final Config config = new Config("example.properties");
		assertNotNull("Value cannot be null", config);
		config.setProperty("TIMESTAMP", Calendar.getInstance().toString());
		LOG.info(config.toString());
	}

	/**
	 * Unit Test to Configuration from properties.
	 *
	 * @throws ConfigurationException the configuration exception
	 */
	@Test
	public void testConfigFromProperties() throws ConfigurationException {
		// System properties used for convenience
		final Properties systemProperties = System.getProperties();
		// load a properties file.
		final Config config = new Config(systemProperties);
		assertNotNull("Value cannot be null", config);
		LOG.info(config.toString());
	}

	/**
	 * Unit Test to Configuration load by file name.
	 *
	 * @throws ConfigurationException the configuration exception
	 */
	@Test
	public void testConfigLoadByFileName() throws ConfigurationException {
		// load a properties file.
		final Config config = new Config();
		assertNotNull("Value cannot be null", config);
		config.loadPropertyFile("example.properties");
		LOG.info(config.toString());
	}

	/**
	 * Unit Test to Configuration save properties.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testConfigSaveProperties() throws Exception {
		// System properties used for convenience
		final Properties systemProperties = System.getProperties();
		// load a properties file.
		final Config config = new Config(systemProperties);
		assertNotNull("Value cannot be null", config);
		LOG.info(config.toString());
		config.save("./target/example.properties");
	}

	/**
	 * Unit Test to missing configuration.
	 *
	 * @throws Exception the exception
	 */
	@Test(expected = ConfigurationException.class)
	public void testMissingConfig() throws Exception {
		assertNotNull("Value cannot be null", new Config("missing"));
	}

	/**
	 * Unit Test to missing configuration properties.
	 *
	 * @throws Exception the exception
	 */
	@Test(expected = ConfigurationException.class)
	public void testMissingConfigProperties() throws Exception {
		assertNotNull("Value cannot be null", new Config("missing.properties"));
	}

}
