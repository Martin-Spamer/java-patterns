package coaching.xml;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class XmlToJdbcTest {

	@Test
	public void testXmlToJdbc() {
		final XmlToJdbc xmlToJdbc = new XmlToJdbc();
		assertNotNull(xmlToJdbc);
	}

}
