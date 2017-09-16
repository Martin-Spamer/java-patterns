package coaching.csv;

import static org.junit.Assert.*;

import org.junit.Test;
import org.slf4j.*;

public class CsvRecordTest {

	private static final Logger LOG = LoggerFactory.getLogger(CsvRecordTest.class);

	@Test
	public void testCsvRecord() {
		LOG.info("testCsvRecord");
		assertNotNull(new CsvRecord());
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
