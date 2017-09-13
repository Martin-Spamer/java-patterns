
package coaching.csv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * CsvFile Class.
 */
public class CsvFile {

	protected static final Logger log = LoggerFactory.getLogger(CsvFile.class);
	private final String csvFilename;
	private String headerLine;
	private String[] columnNames;
	private final ArrayList<CsvRecord> records = new ArrayList<>();

	/**
	 * Instantiates a new csv file.
	 */
	public CsvFile() {
		CsvFile.log.info("CsvFile({})");
		csvFilename = String.format("%s.csv", this.getClass().getSimpleName());
		initialise();
	}

	/**
	 * Instantiates a new csv file.
	 *
	 * csv filename
	 *
	 * @param csvFilename the csv filename
	 */
	public CsvFile(final String csvFilename) {
		CsvFile.log.info("CsvFile({})", csvFilename);
		this.csvFilename = csvFilename;
		initialise();
	}

	/**
	 * Initialise.
	 */
	private void initialise() {
		try {
			read(csvFilename);
		} catch (final IOException e) {
			CsvFile.log.error(e.toString());
		}
	}

	/**
	 * header.
	 *
	 * header
	 *
	 * @return the header
	 */
	public String getHeader() {
		final String colNames = Arrays.toString(columnNames);
		return String.format("#%s", colNames);
	}

	/**
	 * column names.
	 *
	 * column names
	 *
	 * @return the column names
	 */
	public String getColumnNames() {
		return Arrays.toString(columnNames);
	}

	/**
	 * record.
	 *
	 * index
	 * record
	 *
	 * @param index the index
	 * @return the record
	 */
	public CsvRecord getRecord(final int index) {
		return records.get(index);
	}

	/**
	 * Log pretty.
	 */
	public void logPretty() {
		CsvFile.log.info(toString());
	}

	/**
	 * Read.
	 *
	 * buffered reader
	 *
	 * @param bufferedReader the buffered reader
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	private void read(final BufferedReader bufferedReader) throws IOException {
		if (bufferedReader != null) {
			String line = bufferedReader.readLine();
			while (line != null) {
				final int length = line.length();
				if (length > 0) {
					if (line.startsWith("#")) {
						setHeaderLine(line);
					} else {
						final CsvRecord record = new CsvRecord(line);
						final String recordString = record.toString();
						records.add(record);
					}
				}
				line = bufferedReader.readLine();
			}
			bufferedReader.close();
		} else {
			CsvFile.log.info("bufferedReader");
		}
	}

	/**
	 * Read.
	 *
	 * resource as stream
	 *
	 * @param resourceAsStream the resource as stream
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	private void read(final InputStream resourceAsStream) throws IOException {
		if (resourceAsStream != null) {
			final InputStreamReader inputStreamReader = new InputStreamReader(resourceAsStream);
			read(inputStreamReader);
			resourceAsStream.close();
		} else {
			CsvFile.log.info("resourceAsStream");
		}
	}

	/**
	 * Read.
	 *
	 * input stream reader
	 *
	 * @param inputStreamReader the input stream reader
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	private void read(final InputStreamReader inputStreamReader) throws IOException {
		if (inputStreamReader != null) {
			final BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			read(bufferedReader);
			inputStreamReader.close();
		} else {
			CsvFile.log.info("inputStreamReader");
		}
	}

	/**
	 * Read.
	 *
	 * filename
	 *
	 * @param filename the filename
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public void read(final String filename) throws IOException {
		CsvFile.log.info("read({})", filename);
		if (filename != null) {
			final InputStream resourceAsStream = getClass().getResourceAsStream(filename);
			read(resourceAsStream);
		} else {
			CsvFile.log.info("filename");
		}
	}

	/**
	 * header line.
	 *
	 * new header line
	 *
	 * @param line the new
	 * 			header line
	 */
	private void setHeaderLine(final String line) {
		headerLine = line.substring(1);
		columnNames = headerLine.split(",");
	}

	/**
	 * Size.
	 *
	 * int
	 *
	 * @return the int
	 */
	public int size() {
		return records.size();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("CsvFile [columnNames=%s, records=%s]", Arrays.toString(columnNames), records);
	}

	/**
	 * Write.
	 *
	 * filename
	 *
	 * @param filename the filename
	 */
	public void write(final String filename) {
		try {
			final BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
			for (int index = 0; index < records.size(); index++) {
				final CsvRecord csvRecord = records.get(index);
				CsvFile.log.info(csvRecord.toString());
				writer.write(csvRecord.toString());
			}
			writer.close();
		} catch (final Exception exception) {
			CsvFile.log.error(exception.toString());
		}
	}

}
