
package coaching.csv;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for the CsvToJdbc class.
 */
public final class CsvToJdbcTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(CsvToJdbcTest.class);

    /** Default JDBC DRIVER . */
    private static final String DRIVER = "org.sqlite.JDBC";

    /** Default JDBC URL. */
    private static final String URL = "jdbc:";

    /** Default USERNAME for connection. */
    private static final String USERNAME = "...";

    /** Default PASSWORD for connection. */
    private static final String PASSWORD = "...";

    /** Default data source filename. */
    private final String filename = "./data/data.csv";

    /** Default table name. */
    private final String tableName = "tableName";

    /**
     * Fluent Interface.
     *
     */
    @Test
    public void testFluentInterface() {
        final CsvToJdbc instance = new CsvToJdbc();
        assertEquals(instance, instance.setDriver(DRIVER));
        assertEquals(instance, instance.setUrl(URL));
        assertEquals(instance, instance.setUsername(USERNAME));
        assertEquals(instance, instance.setPassword(PASSWORD));
        assertEquals(instance, instance.setTableName(tableName));
        assertEquals(instance, instance.setFilename(filename));
    }

}
