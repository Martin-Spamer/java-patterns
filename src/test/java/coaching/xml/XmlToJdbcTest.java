
package coaching.xml;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import coaching.jdbc.MySqlDao;

/**
 * Unit test for XmlToJdbc class.
 */
public class XmlToJdbcTest {

	/**
	 * Unit Test to xml to jdbc.
	 */
	@Test
	public void testXmlToJdbc() {
		final MySqlDao xmlToJdbc = new XmlToJdbc();
		assertNotNull("Value cannot be null", xmlToJdbc);
	}

}
