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
		assertNotNull(new XmlConfig());
	}

	/**
	 * Unit Test xml configuration string.
	 */
	@Test
	public void testXmlConfigString() {
		assertNotNull(new XmlConfig("Configuration.xml"));
	}

}
