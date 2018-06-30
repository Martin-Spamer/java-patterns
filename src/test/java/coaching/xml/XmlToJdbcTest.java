
package coaching.xml;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import coaching.jdbc.MySqlDao;

/**
 * Unit test for the XmlToJdbc class.
 */
public class XmlToJdbcTest {

    /**
     * Unit Test for xml to jdbc.
     */
    @Test
    public void testXmlToJdbc() {
        final MySqlDao xmlToJdbc = new XmlToJdbc();
        assertNotNull(xmlToJdbc);
    }

}
