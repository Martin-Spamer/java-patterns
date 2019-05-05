
package coaching.csv;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import coaching.csv.CsvFile.FileNotLoadedException;
import lombok.extern.slf4j.Slf4j;

/**
 * Unit tests CSVFile.
 */


@Slf4j
public final class CsvFileTest {

    /**
     * Unit Test to csv file.
     *
     * @throws FileNotLoadedException the file not loaded exception
     */
    @Test
    public void testCsvFile() throws FileNotLoadedException {
        log.info("testCsvFile()");
        final CsvFile csvFile = new CsvFile();
        assertNotNull(csvFile);
        assertEquals(4, csvFile.rowCount());
        log.info(csvFile.toString());
    }

    /**
     * Unit Test to CsvFile class.
     *
     * @throws FileNotLoadedException the file not loaded exception
     */
    @Test
    public void testCsvFileString() throws FileNotLoadedException {
        log.info("testCsvFileString()");
        final CsvFile csvFile = new CsvFile("data.csv");
        assertNotNull(csvFile);
        assertEquals(4, csvFile.rowCount());
        log.info(csvFile.toString());
    }

    /**
     * Unit Test to CsvFile class.
     *
     * @throws FileNotLoadedException the file not loaded exception
     */
    @Test
    public void testCsvFileHeader() throws FileNotLoadedException {
        log.info("testCsvFileHeader()");
        final CsvFile csvFile = new CsvFile();
        assertNotNull(csvFile);
        log.info(csvFile.toString());
        assertNotNull(csvFile.getHeaderLine());
        log.info(csvFile.toString());
    }

    /**
     * Unit Test to CsvFile class.
     *
     * @throws FileNotLoadedException the file not loaded exception
     */
    @Test
    public void testCsvFileRecords() throws FileNotLoadedException {
        log.info("testCsvFileRecords()");
        final CsvFile csvFile = new CsvFile();
        assertNotNull(csvFile);
        for (int index = 0; index < csvFile.rowCount(); index++) {
            final CsvRecord record = csvFile.getRecord(index);
            assertNotNull(record);
            log.info(record.toString());
        }
    }
}
