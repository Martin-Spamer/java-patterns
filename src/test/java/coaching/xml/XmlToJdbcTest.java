
package coaching.xml;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * class XmlToJdbcTest.
 */
public class XmlToJdbcTest {

	/**
	 * Unit Test to xml to jdbc.
	 */
	@Test
	public void testXmlToJdbc() {
		final XmlToJdbc xmlToJdbc = new XmlToJdbc();
		assertNotNull("Value cannot be null", xmlToJdbc);
	}

}
