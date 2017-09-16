
package coaching.config;

import static org.junit.Assert.*;

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
		final Configuration configuration = new Configuration();
		assertNotNull(configuration);
	}

	/**
	 * Unit Test to abstract Configuration string.
	 */
	@Test
	public void testAbstractConfigString() {
		final Configuration configuration = new Configuration("Configuration");
		assertNotNull(configuration);
	}

	/**
	 * Unit Test to get property string.
	 */
	@Test
	public void testGetPropertyString() {
		final Configuration configuration = new Configuration();
		assertNotNull(configuration);
		fail("incomplete");
	}

	/**
	 * Unit Test to get property string string.
	 */
	@Test
	public void testGetPropertyStringString() {
		final Configuration configuration = new Configuration();
		assertNotNull(configuration);
		fail("incomplete");
	}

	/**
	 * Unit Test to to string.
	 */
	@Test
	public void testToString() {
		final Configuration configuration = new Configuration();
		assertNotNull(configuration);
		fail("incomplete");
	}

}
