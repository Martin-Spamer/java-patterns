
package coaching.jdbc;

import java.util.List;

import coaching.csv.CsvFile;
import coaching.csv.CsvRecord;

/**
 * A Data Access object for a MySQL database.
 */
public class MySqlDao extends AbstractDao {

    /** The classname of the JDBC driver to use. */
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";

    /** The URL to use to make JDBC connection. */
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/student";

    /** USER to be used. */
    private static final String USERNAME = "root";

    /** PASSWORD to be used. */
    private static final String PASSWORD = "root";

    /**
     * Instantiates a new my sql dao.
     */
    public MySqlDao() {
        super(JDBC_DRIVER, JDBC_URL, USERNAME, PASSWORD);
    }

    /**
     * Insert rows.
     *
     * @param csvFile the csv file
     */
    public void insertRows(final CsvFile csvFile) {
        insertRows(csvFile.getRowList());
    }

    /**
     * Insert rows.
     *
     * @param rowList the row list
     */
    public void insertRows(final List<CsvRecord> rowList) {
        for (CsvRecord csvRecord : rowList) {
            createRow(csvRecord);
        }
    }

    /**
     * Creates the row.
     *
     * @param csvRecord the csv record
     */
    private void createRow(final CsvRecord csvRecord) {
        super.createRow(INSERT_SQL);
    }

}
