
package coaching.csv;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Unit test for the CsvToJdbc class.
 */
public final class CsvToJdbcTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory
        .getLogger(CsvToJdbcTest.class);

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
        final CsvToJdbc dao = new CsvToJdbc();
        dao.setSource(this.filename);
        dao.setDestination(this.tableName);
        dao.transfer(this.filename, this.tableName);
    }

}
