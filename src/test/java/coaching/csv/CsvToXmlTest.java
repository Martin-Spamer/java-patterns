
package coaching.csv;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit tests for the CsvToJdbc class.
 */


@Slf4j
public final class CsvToXmlTest {

    /** The filename. */
    private final String filename = "./data/data.csv";

    /**
     * Fluent Interface.
     *
     */
    @Test
    public void testFluentInterface() {
        final CsvToXml instance = new CsvToXml();
        assertNotNull(instance);
    }

}
