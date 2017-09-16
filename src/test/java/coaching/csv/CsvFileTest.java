package coaching.csv;

import static org.junit.Assert.*;

import org.junit.Test;
import org.slf4j.*;

/**
 * Unit test CSVFile.
 */
public class CsvFileTest {

	private static final Logger log = LoggerFactory.getLogger(CsvFileTest.class);

	public void testCsvFile() {
		log.info("testCsvFile()");
		final CsvFile csvFile = new CsvFile();
		assertNotNull(csvFile);
		assertEquals(4, csvFile.size());
		log.info("{}", csvFile);
		csvFile.logPretty();
	}

	/**
	 * Unit Test to CsvFile class.
	 */
	@Test
	public void testCsvFileString() {
		log.info("testCsvFileString()");
		final CsvFile csvFile = new CsvFile("/data.csv");
		assertNotNull(csvFile);
		assertEquals(4, csvFile.size());
		log.info("{}", csvFile);
		csvFile.logPretty();
	}

	/**
	 * Unit Test to CsvFile class.
	 */
	@Test
	public void testCsvFileHeader() {
		log.info("testCsvFileHeader()");
		final CsvFile csvFile = new CsvFile();
		assertNotNull(csvFile);
		log.info("{}", csvFile);
		final String header = csvFile.getHeader();
		assertNotNull(header);
		log.info("{}", header);
	}

	/**
	 * Unit Test to CsvFile class.
	 */
	@Test
	public void testCsvFileRecords() {
		log.info("testCsvFileRecords()");
		final CsvFile csvFile = new CsvFile();
		assertNotNull(csvFile);
		for (int index = 0; index < csvFile.size(); index++) {
			final CsvRecord record = csvFile.getRecord(index);
			assertNotNull(record);
			log.info("{}", record);
		}
	}
}
