
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

import coaching.resources.ResourceLoader;
import lombok.extern.slf4j.Slf4j;

/**
 * The CsvFile class represents a data file containing comma separated values.
 */
@Slf4j
public class CsvFile {

    /** The filename. */
    private String csvFilename;

    /** The header line of the csv file. */
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
        log.debug("CsvFile()");
        initialise(defaultFilename());
    }

    /**
     * Default filename.
     *
     * @return the string
     */
    private String defaultFilename() {
        if (this.csvFilename == null) {
            final String stem = this.getClass().getSimpleName();
            this.csvFilename = String.format("%s.csv", stem);
        }
        return this.csvFilename;
    }

    /**
     * Instantiates a new csv file from filename.
     *
     * @param csvFilename the csv filename
     */
    public CsvFile(final String csvFilename) {
        super();
        log.debug("CsvFile({})", csvFilename);
        initialise(csvFilename);
    }

    /**
     * Initialise.
     *
     * @param csvFilename the csv filename
     */
    private void initialise(final String csvFilename) {
        log.debug("initialise({})", csvFilename);
        this.csvFilename = csvFilename;
        read(this.csvFilename);
    }

    /**
     * Read filename.
     *
     * @param resourceName the filename of the resource
     */
    public void read(final String resourceName) {
        log.debug("read({})", resourceName);
        final InputStream stream = ResourceLoader.getStream(resourceName);
        try {
            read(stream);
        } catch (final IOException e) {
            log.error(e.getLocalizedMessage(), e);
        }
    }

    /**
     * Read a resource as a stream.
     *
     * @param resourceAsStream the resource as stream
     * @throws IOException Signals that an I/O exception has occurred.
     */
    private void read(final InputStream resourceAsStream) throws IOException {
        final InputStreamReader inputStreamReader = new InputStreamReader(resourceAsStream);
        read(inputStreamReader);
        inputStreamReader.close();
    }

    /**
     * Read input stream reader.
     *
     * @param inputStreamReader the input stream reader
     * @throws IOException Signals that an I/O exception has occurred.
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
        String line = bufferedReader.readLine();
        while (line != null) {
            if (line.length() > 0) {
                processLine(line.trim());
            }
            line = bufferedReader.readLine();
        }
        this.loaded = true;
    }

    /**
     * Process line.
     *
     * @param line the line
     */
    private void processLine(final String line) {
        log.debug("processLine({})", line);
        if (line.charAt(0) == '#') {
            setHeaderLine(line);
        } else {
            final CsvRecord record = new CsvRecord(line);
            this.records.add(record);
            final String recordString = record.toString();
            log.trace("recordString = {}", recordString);
        }
    }

    /**
     * header line new header line.
     *
     * @param line the new header line
     */
    private void setHeaderLine(final String line) {
        log.debug("setHeaderLine({})", line);
        this.headerLine = line.substring(1);
        this.columnNames = this.headerLine.split(",");
    }

    /**
     * Gets the row.
     *
     * @param index the index
     * @return the row
     */
    public CsvRecord getRow(final int index) {
        return this.records.get(index);
    }

    /**
     * Gets the row list.
     *
     * @return the row list
     */
    public List<CsvRecord> getRowList() {
        return this.records;
    }

    /**
     * Gets the record array.
     *
     * @return the record array
     */
    public CsvRecord[] getRecordArray() {
        return this.records.toArray(new CsvRecord[this.records.size()]);
    }

    /**
     * Write.
     *
     * @param filename the filename
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public void write(final String filename) throws IOException {
        log.debug("write({})", filename);
        final FileWriter out = new FileWriter(filename);
        final BufferedWriter writer = new BufferedWriter(out);
        for (final CsvRecord csvRecord : this.records) {
            log.trace("write csvRecord : {}", csvRecord);
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
        return this.loaded;
    }

    /**
     * Gets the header line.
     *
     * @return the headerLine
     */
    public String getHeaderLine() {
        return this.headerLine;
    }

    /**
     * column names.
     *
     * @return the column names
     */
    public String getColumnNames() {
        return Arrays.toString(this.columnNames);
    }

    /**
     * Gets the column name.
     *
     * @param colNo the col no
     * @return the column name
     */
    public String getColumnName(final int colNo) {
        return this.columnNames[colNo];
    }

    /**
     * Rows.
     *
     * @return the list
     */
    public List<CsvRecord> rows() {
        return this.records;
    }

    /**
     * record.
     *
     * @param index the index
     * @return the record
     */
    public CsvRecord getRecord(final int index) {
        return this.records.get(index);
    }

    /**
     * Size.
     *
     * @return the int
     */
    public int rowCount() {
        return this.records.size();
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [csvFilename=%s, headerLine=%s, columnNames=%s, records=%s]",
            this.getClass().getSimpleName(),
            this.csvFilename,
            this.headerLine,
            Arrays.toString(this.columnNames),
            this.records);
    }

    /**
     * Pretty.
     *
     * @param properties the properties
     * @return the string
     */
    protected String pretty(final String properties) {
        return properties.replace("[", "[\n\t")
                .replace("{", "{\n\t")
                .replace(", ", "\n\t")
                .replace("}", "\n\t}")
                .replace("]", "\n\t]}");
    }

    /**
     * FileNotLoadedException.
     */
    public class FileNotLoadedException extends AssertionError {
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
        public FileNotLoadedException(final String message, final Throwable cause) {
            super(message, cause);
        }
    }

}
