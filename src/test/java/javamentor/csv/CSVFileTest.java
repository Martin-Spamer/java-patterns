package javamentor.csv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Unit test CSVFile.
 */
public class CSVFileTest {

	private static final Logger log = LoggerFactory.getLogger(CSVFileTest.class);

	@Test
	public void testCsvFile() {
		log.info("{}", System.getProperty("user.home"));
		log.info("testCsvFile in");
		final CsvFile csvFile = new CsvFile("/data.csv");
		assertNotNull(csvFile);
		log.info("{}", csvFile);
		assertEquals(4, csvFile.size());

		log.info("testCsvFile out");
		log.info("{}", csvFile.getHeader());
		for (int index = 0; index < csvFile.size(); index++) {
			final CSVRecord record = csvFile.getRecord(index);
			log.info("{}", record);
		}

		csvFile.logPretty();
	}

	/**
	 * Test CSV record.
	 */
	@Test
	public void testCsvRecord() {
		log.info("testCsvRecord");
		final String headerLine = new CSVRecord("#One,Two").toString();
		log.info("headerLine={}", headerLine);
		assertEquals("#One, Two", headerLine);
		final String dataLine = new CSVRecord("One,Two").toString();
		log.info("dataLine={}", dataLine);
		assertEquals("One, Two", dataLine);
	}

}
