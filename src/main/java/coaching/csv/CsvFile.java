
package coaching.csv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The CsvFile class represents a data file containing comma separated values.
 */
public class CsvFile {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(CsvFile.class);

    /** The filename. */
    private String csvFilename;

    /** The header line of the csv file */
    private String headerLine;

    /** The column names for the csv file. */
    private String[] columnNames;

    /** The records, the rows of the csv file holding data. */
    private final List<CsvRecord> records = new ArrayList<>();

    /** The loaded successfully. */
    private boolean loaded;

    /**
     * Instantiates a new csv file.
     *
     * @throws FileNotLoadedException
     */
    public CsvFile() {
        super();
        LOG.debug("CsvFile()");
        initialise(defaultFilename());
        LOG.trace(toString());
    }

    private String defaultFilename() {
        if (csvFilename == null) {
            String stem = this.getClass().getSimpleName();
            csvFilename = String.format("%s.csv", stem);
        }
        return csvFilename;
    }

    /**
     * Instantiates a new csv file from filename.
     *
     * @param csvFilename
     *            the csv filename
     * @throws FileNotLoadedException
     */
    public CsvFile(final String csvFilename) {
        super();
        LOG.debug("CsvFile({})", csvFilename);
        initialise(csvFilename);
        LOG.trace(toString());
    }

    /**
     * Initialise.
     *
     * @throws FileNotLoadedException
     */
    private void initialise(final String csvFilename) {
        LOG.debug("initialise({})", csvFilename);
        this.csvFilename = csvFilename;
        read(this.csvFilename);
    }

    /**
     * Read filename.
     *
     * @param filename the filename
     * @throws FileNotLoadedException
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public void read(final String filename) {
        LOG.debug("read({})", filename);
        final ClassLoader classLoader = this.getClass().getClassLoader();
        try {
            final InputStream resourceAsStream = classLoader.getResourceAsStream(filename);
            if (resourceAsStream != null) {
                read(resourceAsStream);
                resourceAsStream.close();
            } else {
                final String msg = String.format("Resource %s not found", filename);
                LOG.warn("{} on read({})", msg, filename);
                throw new FileNotLoadedException(msg);
            }
        } catch (final IOException e) {
            LOG.error(e.getMessage(), e);
            throw new FileNotLoadedException(e.toString(), e);
        }
    }

    /**
     * Read a resource as a stream.
     *
     * @param resourceAsStream
     *            the resource as stream
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    private void read(final InputStream resourceAsStream) throws IOException {
        final InputStreamReader inputStreamReader = new InputStreamReader(resourceAsStream);
        read(inputStreamReader);
        inputStreamReader.close();
    }

    /**
     * Read input stream reader.
     *
     * @param inputStreamReader
     *            the input stream reader
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    private void read(final InputStreamReader inputStreamReader) throws IOException {
        final BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        read(bufferedReader);
        bufferedReader.close();
    }

    /**
     * Read.
     *
     * @param bufferedReader the buffered reader
     * @throws IOException Signals that an I/O exception has occurred.
     */
    private void read(final BufferedReader bufferedReader) throws IOException {
        String line = bufferedReader.readLine().trim();
        while (line != null) {
            if (line.length() > 0) {
                processLine(line);
            }
            line = bufferedReader.readLine();
        }
        loaded = true;
    }

    /**
     * Process line.
     *
     * @param line
     *            the line
     */
    protected void processLine(final String line) {
        LOG.debug("processLine({})", line);
        if (line.charAt(0) == '#') {
            setHeaderLine(line);
        } else {
            final CsvRecord record = new CsvRecord(line);
            records.add(record);
            final String recordString = record.toString();
            LOG.trace("recordString = {}", recordString);
        }
    }

    /**
     * header line new header line.
     *
     * @param line
     *            the new header line
     */
    private void setHeaderLine(final String line) {
        LOG.debug("setHeaderLine({})", line);
        headerLine = line.substring(1);
        columnNames = headerLine.split(",");
    }

    /**
     * Write.
     *
     * @param filename the filename
     * @throws IOException
     */
    public void write(final String filename) throws IOException {
        LOG.debug("write({})", filename);
        final FileWriter out = new FileWriter(filename);
        final BufferedWriter writer = new BufferedWriter(out);
        for (final CsvRecord csvRecord : records) {
            LOG.trace("write csvRecord : {}", csvRecord);
            writer.write(csvRecord.toString());
        }
        writer.close();
    }

    /**
     * Checks if is loaded.
     *
     * @return true, if checks if is loaded
     */
    public boolean isLoaded() {
        return loaded;
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
        return headerLine;
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
     * record.
     *
     * @param index
     *            the index
     * @return the record
     */
    public CsvRecord getRecord(final int index) {
        return records.get(index);
    }

    /**
     * Size.
     *
     * @return the int
     */
    public int rowCount() {
        return records.size();
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String
            .format("%s [csvFilename=%s, headerLine=%s, columnNames=%s, records=%s]",
                    this.getClass().getSimpleName(),
                    csvFilename,
                    headerLine,
                    Arrays.toString(columnNames),
                    records);
    }

    /**
     * Pretty.
     *
     * @param properties the properties
     * @return the string
     */
    protected String pretty(final String properties) {
        return properties
            .replace("[", "[\n\t")
            .replace("{", "{\n\t")
            .replace(", ", "\n\t")
            .replace("}", "\n\t}")
            .replace("]", "\n\t]}");
    }

    public class FileNotLoadedException extends AssertionError {
        private static final long serialVersionUID = 1L;

        public FileNotLoadedException() {
            super();
        }

        public FileNotLoadedException(final String message) {
            super(message);
        }

        public FileNotLoadedException(final String message, final Throwable cause) {
            super(message, cause);
        }
    }
}
