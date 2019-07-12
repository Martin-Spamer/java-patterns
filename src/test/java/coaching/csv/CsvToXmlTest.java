
package coaching.csv;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit tests for the CsvToXml class.
 */
@Slf4j
public final class CsvToXmlTest {

    private static final String SOURCE_FILENAME = "./data/data.csv";
    private static final String DESTINATION_FILENAME = "./data/new.xml";

    @Test
    public void testCsvToXml() {
        final CsvToXml instance = new CsvToXml();
        assertNotNull(instance);
    }

    @Test
    public void testCsvToXmlFilename() {
        final CsvToXml instance = new CsvToXml(SOURCE_FILENAME);
        assertNotNull(instance);
    }

    @Test
    public void testCsvToXmlFluently() {
        final CsvToXml instance = CsvToXml.open(SOURCE_FILENAME);
        assertNotNull(instance);
        assertEquals(instance, instance.write(DESTINATION_FILENAME));
    }

}
