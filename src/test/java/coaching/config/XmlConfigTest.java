
package coaching.config;

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
		new XmlConfig();
	}

	/**
	 * Unit Test to xml config string.
	 */
	@Test
	public void testXmlConfigString() {
		new XmlConfig("filename.xml");
	}

}
