
package coaching.csv;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import coaching.jdbc.DynamicDao;

/**
 * A class to read a CSV file and write data to JDBC table.
 */
public final class CsvToJdbc {

    /** provides logging. */
    private final Logger log = LoggerFactory
        .getLogger(this.getClass().getSimpleName());

    /** CSV file. */
    private final CsvFile csvFile = new CsvFile();

    private final DynamicDao dao = new DynamicDao();

    /**
     * Instantiates a new csv to jdbc.
     */
    public CsvToJdbc() {
        super();
    }

    public void setSource(final String filename) {
        this.csvFile.read(filename);
    }

    public void setDestination(final String tableName) {
        this.dao.setTableName(tableName);
    }

    public void transfer(final String filename, final String tableName) {
    }

}
