
package javamentor.csv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javamentor.csv.CSVRecord;
import javamentor.csv.CsvFile;

/**
 * The CSVFileTest Class.
 */
public class CSVFileTest {

	/** The Constant log. */
	private static final Logger log = LoggerFactory.getLogger(CSVFileTest.class);

	/**
	 * Test csv file.
	 */
	@Test
	public void testCsvFile() {
		log.info("testCsvFile in");
		final CsvFile csvFile = new CsvFile("/data/data.csv");
		assertNotNull(csvFile);
		assertEquals(4, csvFile.size());
		log.info("===================");

		log.info("testCsvFile out");
		log.info("{}", csvFile.getHeader());
		for (int index = 0; index < csvFile.size(); index++) {
			final CSVRecord record = csvFile.getRecord(index);
			log.info("{}", record);
		}
		csvFile.logPretty();
	}

	/**
	 * Test csv record.
	 */
	@Test
	public void testCsvRecord() {
		log.info("testCsvRecord");
		assertEquals("#One, Two", new CSVRecord("#One,Two").toString());
		assertEquals("One, Two", new CSVRecord("One,Two").toString());
	}

}
