package javamentor.config;

import org.junit.Test;

public class XmlConfigTest {

	@Test
	public void testXmlConfig() {
		new XmlConfig();
	}

	@Test
	public void testXmlConfigString() {
		new XmlConfig("filename.xml");
	}

}
