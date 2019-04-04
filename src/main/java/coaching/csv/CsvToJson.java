
package coaching.csv;

import org.json.simple.JSONObject;

import static org.junit.Assume.assumeNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * The Class CsvToJson.
 */
@Slf4j
public final class CsvToJson {

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
        this.csvFile.read(resourceName);
    }

    /**
     * Write.
     */
    public void write() {
        final JSONObject json = new JSONObject();
        assumeNotNull(json);
        for (int rowIndex = 0; rowIndex < this.csvFile.rowCount(); rowIndex++) {
            final JSONObject rowJson = new JSONObject();
            final CsvRecord record = this.csvFile.getRecord(rowIndex);
            for (int colNo = 0; colNo < record.columnCount(); colNo++) {
                final String name = this.csvFile.getColumnName(colNo);
                final String value = record.getColumn(colNo);
                rowJson.put(name, value);
            }
            json.put("row", record);
        }

        log.info(json.toString());
    }
}
