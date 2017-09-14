package coaching.config;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * The XmlConfigTest Class.
 */
public class XmlConfigTest {

	/**
	 * Unit Test to xml config.
	 */
	@Test
	public void testXmlConfig() {
		assertNotNull(new XmlConfig());
	}

	/**
	 * Unit Test to xml config string.
	 */
	@Test
	public void testXmlConfigString() {
		assertNotNull(new XmlConfig("filename.xml"));
	}

}
