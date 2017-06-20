package idioms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ConfigurationTest Class.
 */
public class ConfigurationTest {

	private static final Logger LOG = LoggerFactory.getLogger(ConfigurationTest.class);

	/**
	 * Unit Test to configuration.
	 */
	@Test
	public void testConfiguration() {
		final Configuration config = new Configuration();
		assertNotNull(config);
		assertEquals(null, config.valueFor("missing"));
		assertEquals("./Configuration.properties", config.valueFor("File"));
		assertEquals("JavaMentor", config.valueFor("Project"));
		assertEquals("Value.000", config.valueFor("000"));
		assertEquals("Value.001", config.valueFor("001"));
		assertEquals("Value.002", config.valueFor("002"));
		LOG.info("{}", config.toString());
		LOG.info("{}", config.toPrettyString());
	}

}
