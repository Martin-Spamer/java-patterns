
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

import coaching.resources.ResourceLoader;

/**
 * The CsvFile class represents a data file containing comma separated values.
 */
public class CsvFile {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(CsvFile.class);

    /** The filename. */
    private String csvFilename;

    /**  The header line of the csv file. */
    private String headerLine;

    /** The column names for the csv file. */
    private String[] columnNames;

    /** The records, the rows of the csv file holding data. */
    private final List<CsvRecord> records = new ArrayList<>();

    /** The loaded successfully. */
    private boolean loaded;

    /**
     * Instantiates a new csv file.
     */
    public CsvFile() {
        super();
        LOG.debug("CsvFile()");
        initialise(defaultFilename());
        LOG.debug("TODO {}", this);
    }

    /**
     * Default filename.
     *
     * @return the string
     */
    private String defaultFilename() {
        if (csvFilename == null) {
            final String stem = this.getClass().getSimpleName();
            csvFilename = String.format("%s.csv", stem);
        }
        return csvFilename;
    }

    /**
     * Instantiates a new csv file from filename.
     *
     * @param csvFilename            the csv filename
     */
    public CsvFile(final String csvFilename) {
        super();
        LOG.debug("CsvFile({})", csvFilename);
        initialise(csvFilename);
        LOG.debug("TODO {}", this);
    }

    /**
     * Initialise.
     *
     * @param csvFilename the csv filename
     */
    private void initialise(final String csvFilename) {
        LOG.debug("initialise({})", csvFilename);
        this.csvFilename = csvFilename;
        read(this.csvFilename);
    }

    /**
     * Read filename.
     *
     * @param resourceName the filename of the resource
     */
    private void read(final String resourceName) {
        LOG.debug("read({})", resourceName);
        InputStream stream = ResourceLoader.getStream(resourceName);
        try {
            read(stream);
        } catch (IOException e) {
            LOG.error(e.getLocalizedMessage(), e);
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
        final InputStreamReader inputStreamReader = new InputStreamReader(
                resourceAsStream);
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
    private void read(final InputStreamReader inputStreamReader)
            throws IOException {
        final BufferedReader bufferedReader = new BufferedReader(
                inputStreamReader);
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
        String line = bufferedReader.readLine();
        while (line != null) {
            if (line.length() > 0) {
                processLine(line.trim());
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
     * @throws IOException Signals that an I/O exception has occurred.
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

    /**
     * The Class FileNotLoadedException.
     */
    public class FileNotLoadedException extends AssertionError {
        
        /** serialVersionUID 			constant. */
        private static final long serialVersionUID = 1L;

        /**
         * Instantiates a new file not loaded exception.
         */
        public FileNotLoadedException() {
            super();
        }

        /**
         * Instantiates a new file not loaded exception.
         *
         * @param message the message
         */
        public FileNotLoadedException(final String message) {
            super(message);
        }

        /**
         * Instantiates a new file not loaded exception.
         *
         * @param message the message
         * @param cause the cause
         */
        public FileNotLoadedException(final String message,
                final Throwable cause) {
            super(message, cause);
        }
    }
}
