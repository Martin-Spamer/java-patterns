package javamentor.fileio;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javamentor.fileio.Config.ConfigurationException;

/**
 * Configuration Test Class.
 */
public class ConfigTest {

	private static final Logger LOG = LoggerFactory.getLogger(ConfigTest.class);

	@Test
	public void testConfig() throws ConfigurationException {
		// load a properties file.
		final Config config = new Config("example.properties");
		config.setProperty("TIMESTAMP", java.util.Calendar.getInstance().toString());
		LOG.info(config.toString());
	}

	@Test
	public void testConfigFromProperties() throws ConfigurationException {
		// System properties used for convenience
		final java.util.Properties systemProperties = System.getProperties();
		// load a properties file.
		final Config config = new Config(systemProperties);
		LOG.info(config.toString());
	}

	@Test
	public void testConfigLoadByFileName() throws ConfigurationException {
		// load a properties file.
		final Config config = new Config();
		config.loadPropertyFile("example.properties");
		LOG.info(config.toString());
	}

	@Test
	public void testConfigSaveProperties() throws Exception {
		// System properties used for convenience
		final java.util.Properties systemProperties = System.getProperties();
		// load a properties file.
		final Config config = new Config(systemProperties);
		LOG.info(config.toString());
		config.save("./target/example.properties");
	}

	@Test(expected = ConfigurationException.class)
	public void testMissingConfig() throws Exception {
		// load a properties file.
		new Config("missing");
	}

	@Test(expected = ConfigurationException.class)
	public void testMissingConfigProperties() throws Exception {
		// load a properties file.
		new Config("missing.properties");
	}

}
