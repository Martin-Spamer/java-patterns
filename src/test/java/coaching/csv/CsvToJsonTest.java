
package coaching.csv;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Unit tests for the CsvToJdbc class.
 */
public final class CsvToJsonTest {

    private final String filename = "./data/data.csv";

    @Test
    public void testCsvToJson() {
        final CsvToJson instance = new CsvToJson(this.filename);
        assertNotNull(instance);
    }

}
