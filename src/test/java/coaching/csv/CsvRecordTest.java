
package coaching.csv;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Unit tests for CsvRecord class.
 */
public final class CsvRecordTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(CsvRecordTest.class);

    /**
     * Unit Test the CsvRecord default constructor.
     */
    @Test
    public void testCsvRecord() {
        LOG.info("testCsvRecord");
        final CsvRecord record = new CsvRecord();
        assertNotNull(record);
        LOG.info(record.toString());
    }

    /**
     * Unit Test the CsvRecord constructor with a String.
     */
    @Test
    public void testCsvRecordString() {
        LOG.info("testCsvRecordString");
        final String record = new CsvRecord("One,Two").toString();
        assertEquals("CsvRecord [fields=[One, Two]]", record);
        LOG.info(record.toString());
    }

}
