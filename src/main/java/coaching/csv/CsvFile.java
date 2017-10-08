
package coaching.csv;

import java.io.*;
import java.util.*;

import org.slf4j.*;

/**
 * Represent a comma separated value file class.
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
		log.info("CsvFile({})");
		csvFilename = String.format("%s.csv", this.getClass().getSimpleName());
		initialise();
	}

	/**
	 * Instantiates a new csv file from filename.
	 *
	 * @param csvFilename the csv filename
	 */
	public CsvFile(final String csvFilename) {
		log.info("CsvFile({})", csvFilename);
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
			log.error(e.toString());
		}
	}

	/**
	 * Gets the header line.
	 *
	 * @return the headerLine
	 */
	public String getHeaderLine() {
		return headerLine;
	}

	/**
	 * header.
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
	 * @return the column names
	 */
	public String getColumnNames() {
		return Arrays.toString(columnNames);
	}

	/**
	 * Read filename.
	 *
	 * @param filename the filename
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public void read(final String filename) throws IOException {
		log.info("read({})", filename);
		if (filename != null) {
			final InputStream resourceAsStream = getClass().getResourceAsStream(filename);
			read(resourceAsStream);
		} else {
			log.info("filename");
		}
	}

	/**
	 * Read a resource as a stream.
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
			log.info("resourceAsStream");
		}
	}

	/**
	 * Read input stream reader.
	 *
	 * @param inputStreamReader the input stream reader
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	private void read(final InputStreamReader inputStreamReader) throws IOException {
		if (inputStreamReader != null) {
			final BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			read(bufferedReader);
			inputStreamReader.close();
		}
	}

	/**
	 * Read.
	 *
	 * @param bufferedReader the buffered reader
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	private void read(final BufferedReader bufferedReader) throws IOException {
		if (bufferedReader != null) {
			String line = bufferedReader.readLine().trim();
			while (line != null) {
				if (line.length() > 0) {
					if (line.charAt(0) == '#') {
						setHeaderLine(line);
					} else {
						final CsvRecord record = new CsvRecord(line);
						records.add(record);
						final String recordString = record.toString();
						log.info("recordString={}", recordString);
					}
				}
				line = bufferedReader.readLine();
			}
			bufferedReader.close();
		} else {
			log.info("bufferedReader");
		}
	}

	/**
	 * header line new header line.
	 *
	 * @param line the new
	 *            header line
	 */
	private void setHeaderLine(final String line) {
		headerLine = line.substring(1);
		columnNames = headerLine.split(",");
	}

	/**
	 * Write.
	 *
	 * @param filename the filename
	 */
	public void write(final String filename) {
		try {
			final BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
			for (int index = 0; index < records.size(); index++) {
				final CsvRecord csvRecord = records.get(index);
				log.info("{}", csvRecord);
				writer.write(csvRecord.toString());
			}
			writer.close();
		} catch (final Exception exception) {
			log.error(exception.toString());
		}
	}

	/**
	 * record.
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
	 * Size.
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

}
