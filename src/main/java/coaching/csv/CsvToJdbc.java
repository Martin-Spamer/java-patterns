
package coaching.csv;

import coaching.jdbc.DynamicDao;

/**
 * A class to read a CSV file and write data to JDBC table.
 */
public final class CsvToJdbc {

    /** CSV file. */
    private final CsvFile csvFile = new CsvFile();

    /** The dao. */
    private final DynamicDao dao = new DynamicDao();

    /**
     * Instantiates a new csv to jdbc.
     */
    public CsvToJdbc() {
        super();
    }

    /**
     * Transfer.
     *
     * @param filename the filename
     * @param tableName the table name
     */
    public void transfer(final String filename, final String tableName) {
        this.csvFile.read(filename);
        this.csvFile.rows();
        this.dao.setTableName(tableName);
    }

}
