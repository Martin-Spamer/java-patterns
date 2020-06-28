
package coaching.csv;

import org.junit.Test;

/**
 * Unit test for the CsvToJdbc class.
 */
public final class CsvToJdbcTest {

    private final String TEST_FILENAME = "./data/data.csv";
    private final String tableName = "tableName";

    @Test
    public void testCsvToDao() {
        new CsvToDao();
    }

    @Test
    public void testCsvToDaoFilename() {
        new CsvToDao(this.TEST_FILENAME);
    }

}
