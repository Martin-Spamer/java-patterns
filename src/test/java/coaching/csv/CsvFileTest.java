
package coaching.csv;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import coaching.csv.CsvFile.FileNotLoadedException;

/**
 * Unit tests CSVFile.
 */
public final class CsvFileTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(CsvFileTest.class);

    /**
     * Unit Test to csv file.
     *
     * @throws FileNotLoadedException
     */
    @Test
    public void testCsvFile() throws FileNotLoadedException {
        LOG.info("testCsvFile()");
        final CsvFile csvFile = new CsvFile();
        assertNotNull(csvFile);
        assertEquals(4, csvFile.rowCount());
        LOG.info(csvFile.toString());
    }

    /**
     * Unit Test to CsvFile class.
     */
    @Test
    public void testCsvFileString() throws FileNotLoadedException {
        LOG.info("testCsvFileString()");
        final CsvFile csvFile = new CsvFile("data.csv");
        assertNotNull(csvFile);
        assertEquals(4, csvFile.rowCount());
        LOG.info(csvFile.toString());
    }

    /**
     * Unit Test to CsvFile class.
     */
    @Test
    public void testCsvFileHeader() throws FileNotLoadedException {
        LOG.info("testCsvFileHeader()");
        final CsvFile csvFile = new CsvFile();
        assertNotNull(csvFile);
        LOG.info(csvFile.toString());
        assertNotNull(csvFile.getHeaderLine());
        LOG.info(csvFile.toString());
    }

    /**
     * Unit Test to CsvFile class.
     */
    @Test
    public void testCsvFileRecords() throws FileNotLoadedException {
        LOG.info("testCsvFileRecords()");
        final CsvFile csvFile = new CsvFile();
        assertNotNull(csvFile);
        for (int index = 0; index < csvFile.rowCount(); index++) {
            final CsvRecord record = csvFile.getRecord(index);
            assertNotNull(record);
            LOG.info(record.toString());
        }
    }
}
