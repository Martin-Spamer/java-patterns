
package coaching.csv;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * A UnitTest for CsvRecord objects.
 */
public final class CsvRecordTest {

    /**
     * Unit Test the CsvRecord default constructor.
     */
    @Test
    public void testCsvRecord() {
        final CsvRecord csvRecord = new CsvRecord();
        assertNotNull(csvRecord);
        assertTrue(csvRecord.isEmpty());
        assertEquals(0, csvRecord.columnCount());
        csvRecord.add("One");
        csvRecord.add("Two");
        assertEquals(2, csvRecord.columnCount());
        assertEquals("One", csvRecord.getColumn(0));
        assertEquals("Two", csvRecord.getColumn(1));
        assertEquals("CsvRecord [fields=[One, Two]]", csvRecord.toString());
    }

    /**
     * Unit Test the CsvRecord constructor with a String.
     */
    @Test
    public void testCsvRecordString() {
        CsvRecord csvRecord = new CsvRecord("One, Two");
        assertNotNull(csvRecord);
        assertFalse(csvRecord.isEmpty());
        assertEquals(2, csvRecord.columnCount());
        assertEquals("One", csvRecord.getColumn(0));
        assertEquals("Two", csvRecord.getColumn(1));
        assertEquals("CsvRecord [fields=[One, Two]]", csvRecord.toString());
    }

}
