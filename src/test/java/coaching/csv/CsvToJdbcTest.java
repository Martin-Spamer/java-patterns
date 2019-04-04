
package coaching.csv;

import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit test for the CsvToJdbc class.
 */
@Slf4j
public final class CsvToJdbcTest {

    /** Default data source filename. */
    private final String filename = "./data/data.csv";

    /** Default table name. */
    private final String tableName = "tableName";

    /**
     * Fluent Interface.
     */
    @Test
    public void testFluentInterface() {
        new CsvToJdbc().transfer(this.filename, this.tableName);
    }

}
