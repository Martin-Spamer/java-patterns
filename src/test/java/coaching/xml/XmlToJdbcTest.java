
package coaching.xml;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import coaching.jdbc.XmlToJdbc;
import lombok.extern.slf4j.Slf4j;

/**
 * Unit test for the XmlToJdbc class.
 */


@Slf4j
public final class XmlToJdbcTest {

    /** The classname of the JDBC driver to use. */
    public static final String JDBC_DRIVER = "org.sqlite.JDBC";

    /** The URL to use to make JDBC connection. */
    public static final String JDBC_URL = "jdbc:sqlite::memory:";

    /** USERNAME. */
    public static final String USERNAME = "username";

    /** PASSWORD. */
    private static final String PASSWORD = "password";

    /** Default data source filename. */
    private final String filename = "data/data.csv";

    /** Default table name. */
    private final String tableName = "tableName";

    /**
     * Unit Test for the XmlToJdbc class.
     *
     * @throws ClassNotFoundException the class not found exception
     */
    @Test
    public void testXmlToJdbc() throws ClassNotFoundException {
        final XmlToJdbc instance = new XmlToJdbc();
        assertNotNull(instance);

        // assertEquals(instance, instance.setDriver(JDBC_DRIVER));
        // assertEquals(instance, instance.setUrl(JDBC_URL));
        // assertEquals(instance, instance.setUsername(USERNAME));
        // assertEquals(instance, instance.setPassword(PASSWORD));
    }

}
