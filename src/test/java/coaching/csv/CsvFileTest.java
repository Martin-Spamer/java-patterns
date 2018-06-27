
package coaching.csv;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Unit test CSVFile.
 */
public class CsvFileTest {

    /** provides logging. */
    private static final Logger LOG  = LoggerFactory.getLogger(CsvFileTest.class);

    /**
     * Unit Test to csv file.
     */
    public void testCsvFile() {
        LOG.info("testCsvFile()");
        final CsvFile csvFile = new CsvFile();
        assertNotNull("Value cannot be null", csvFile);
        assertEquals(4, csvFile.size());
        LOG.info("{}", csvFile);
        csvFile.logPretty();
    }

    /**
     * Unit Test to CsvFile class.
     */
    @Test
    public void testCsvFileString() {
        LOG.info("testCsvFileString()");
        final CsvFile csvFile = new CsvFile("/data.csv");
        assertNotNull("Value cannot be null", csvFile);
        assertEquals(4, csvFile.size());
        LOG.info("{}", csvFile);
        csvFile.logPretty();
    }

    /**
     * Unit Test to CsvFile class.
     */
    @Test
    public void testCsvFileHeader() {
        LOG.info("testCsvFileHeader()");
        final CsvFile csvFile = new CsvFile();
        assertNotNull("Value cannot be null", csvFile);
        LOG.info("{}", csvFile);
        final String header = csvFile.getHeader();
        assertNotNull("Value cannot be null", header);
        LOG.info("{}", header);
    }

    /**
     * Unit Test to CsvFile class.
     */
    @Test
    public void testCsvFileRecords() {
        LOG.info("testCsvFileRecords()");
        final CsvFile csvFile = new CsvFile();
        assertNotNull("Value cannot be null", csvFile);
        for (int index = 0; index < csvFile.size(); index++) {
            final CsvRecord record = csvFile.getRecord(index);
            assertNotNull("Value cannot be null", record);
            LOG.info("{}", record);
        }
    }
}
