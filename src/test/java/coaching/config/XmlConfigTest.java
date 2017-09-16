package coaching.config;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.*;

/**
 * The XmlConfigTest Class.
 */
public class XmlConfigTest {

	private static final Logger LOG = LoggerFactory.getLogger(XmlConfigTest.class);

	/**
	 * Unit Test to xml config.
	 */
	@Test
	public void testXmlConfig() {
		assertNotNull(new XmlConfig());
	}

	/**
	 * Unit Test to xml Configuration string.
	 */
	@Test
	public void testXmlConfigString() {
		assertNotNull(new XmlConfig("Configuration.xml"));
	}

}
