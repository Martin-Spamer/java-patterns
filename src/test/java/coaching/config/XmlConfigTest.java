package coaching.config;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.*;

/**
 * Unit test xml configuration class.
 */
public class XmlConfigTest {

	private static final Logger LOG = LoggerFactory.getLogger(XmlConfigTest.class);

	/**
	 * Unit Test xml configuration.
	 */
	@Test
	public void testXmlConfig() {
		final XmlConfig instance = new XmlConfig();
		assertNotNull(instance);
		LOG.debug("{}", instance.toString());
	}

	/**
	 * Unit Test xml configuration string.
	 */
	@Test
	public void testXmlConfigString() {
		final XmlConfig instance = new XmlConfig("Configuration.xml");
		assertNotNull(instance);
		LOG.debug("{}", instance.toString());
	}

}
