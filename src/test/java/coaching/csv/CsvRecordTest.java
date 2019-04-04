
package coaching.csv;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit tests for CsvRecord class.
 */
@Slf4j
public final class CsvRecordTest {

    /**
     * Unit Test the CsvRecord default constructor.
     */
    @Test
    public void testCsvRecord() {
        log.info("testCsvRecord");
        final CsvRecord record = new CsvRecord();
        assertNotNull(record);
        log.info(record.toString());
    }

    /**
     * Unit Test the CsvRecord constructor with a String.
     */
    @Test
    public void testCsvRecordString() {
        log.info("testCsvRecordString");
        final String record = new CsvRecord("One,Two").toString();
        assertEquals("CsvRecord [fields=[One, Two]]", record);
        log.info(record.toString());
    }

}
