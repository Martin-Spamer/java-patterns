
package coaching.csv;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * CsvToJdbcTest Class.
 */
public class CsvToJdbcTest {

    /** The Constant DRIVER. */
    private static final String DRIVER = "org.postgresql.Driver";
    
    /** The Constant URL. */
    private static final String URL = "jdbc:postgresql://localhost";
    
    /** The Constant USERNAME. */
    private static final String USERNAME = "postgres";
    
    /** The Constant PASSWORD. */
    private static final String PASSWORD = "password";
    
    /** The filename. */
    private final String filename = "./data/data.csv";
    
    /** The table name. */
    private final String tableName = "tableName";
    
    /** The log. */
    protected final Logger log = LoggerFactory.getLogger(CsvToJdbcTest.class);

    /**
     * Fluent Interface.
     *
     * @throws Exception
     *             the exception
     */
    @Test
    public void testFluentInterface() throws Exception {
        final CsvToJdbc instance = new CsvToJdbc();
        assertEquals(instance, instance.setDriver(DRIVER));
        assertEquals(instance, instance.setUrl(URL));
        assertEquals(instance, instance.setUsername(USERNAME));
        assertEquals(instance, instance.setPassword(PASSWORD));
        assertEquals(instance, instance.setTableName(this.tableName));
        assertEquals(instance, instance.setFilename(this.filename));
    }

}
