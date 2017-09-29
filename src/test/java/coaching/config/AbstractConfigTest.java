package coaching.config;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.*;

/**
 * Unit test for Abstract configuration class.
 */
public class AbstractConfigTest {

	private static final Logger LOG = LoggerFactory.getLogger(AbstractConfigTest.class);

	public class Configuration extends AbstractConfig {

		public Configuration() {
			super();
		}

		public Configuration(final String configFilename) {
			super(configFilename);
		}
	}

	/**
	 * Unit Test to abstract configuration.
	 */
	@Test
	public void testAbstractConfig() {
		LOG.info("testAbstractConfig");
		final Configuration configuration = new Configuration();
		assertNotNull("Value cannot be null",configuration);
	}

	/**
	 * Unit Test to abstract Configuration string.
	 */
	@Test
	public void testAbstractConfigString() {
		LOG.info("testAbstractConfig");
		final Configuration configuration = new Configuration("Configuration");
		assertNotNull("Value cannot be null",configuration);
	}

	/**
	 * Unit Test to get property string.
	 */
	@Test
	public void testGetPropertyString() {
		final Configuration configuration = new Configuration("Configuration");
		assertNotNull("Value cannot be null",configuration);
		final String value = configuration.getProperty("key");
		assertNotNull("Value cannot be null",value);
	}

	/**
	 * Unit Test to to string.
	 */
	@Test
	public void testToString() {
		final Configuration configuration = new Configuration();
		assertNotNull("Value cannot be null",configuration);
		final String string = configuration.toString();
		assertNotNull("Value cannot be null",string);
	}

}
