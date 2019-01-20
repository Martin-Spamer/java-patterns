
package coaching.csv;

import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assume.assumeNotNull;

/**
 * The Class CsvToJson.
 */
public final class CsvToJson {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(CsvToJson.class);

    /** CSV file. */
    private final CsvFile csvFile = new CsvFile();

    /**
     * Instantiates a new csv to json.
     */
    public CsvToJson() {
        super();
    }

    /**
     * Process.
     */
    public void process() {
        read("");
        write();
    }

    /**
     * Read.
     *
     * @param resourceName the resource name
     */
    public void read(final String resourceName) {
        csvFile.read(resourceName);
    }

    /**
     * Write.
     */
    public void write() {
        final JSONObject json = new JSONObject();
        assumeNotNull(json);
        for (int rowIndex = 0; rowIndex < csvFile.rowCount(); rowIndex++) {
            final JSONObject rowJson = new JSONObject();
            final CsvRecord record = csvFile.getRecord(rowIndex);
            for (int colNo = 0; colNo < record.columnCount(); colNo++) {
                final String name = csvFile.getColumnName(colNo);
                final String value = record.getColumn(colNo);
                rowJson.put(name, value);
            }
            json.put("row", record);
        }

        LOG.info(json.toString());
    }
}
