
package coaching.csv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * class CsvRecordTest.
 */
public class CsvRecordTest {

	private static final Logger LOG = LoggerFactory.getLogger(CsvRecordTest.class);

	/**
	 * Unit Test to csv record.
	 */
	@Test
	public void testCsvRecord() {
		LOG.info("testCsvRecord");
		assertNotNull("Value cannot be null", new CsvRecord());
	}

	/**
	 * Test CSV record.
	 */
	@Test
	public void testCsvFileRecord() {
		LOG.info("testCsvRecord");

		final String headerLine = new CsvRecord("#One,Two").toString();
		assertEquals("#One, Two", headerLine);
		LOG.info("headerLine={}", headerLine);

		final String dataLine = new CsvRecord("One,Two").toString();
		assertEquals("One, Two", dataLine);
		LOG.info("dataLine={}", dataLine);
	}

}
