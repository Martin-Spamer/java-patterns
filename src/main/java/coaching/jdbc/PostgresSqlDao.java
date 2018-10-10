
package coaching.jdbc;

import java.util.List;

import coaching.csv.CsvFile;
import coaching.csv.CsvRecord;

/**
 * A Data Access object for PostgreSql Database.
 */
public class PostgresSqlDao extends AbstractDao {

    /** The classname of the JDBC driver to use. */
    private static final String JDBC_DRIVER = "org.postgresql.Driver";

    /** The URL to use to make JDBC connection. */
    private static final String JDBC_URL = "jdbc:postgresql://localhost";

    /** USERNAME to be used. */
    private static final String USERNAME = "postgres";

    /** PASSWORD to be used. */
    private static final String PASSWORD = "password";

    public PostgresSqlDao() {
        super(JDBC_DRIVER, JDBC_URL, USERNAME, PASSWORD);
    }

    public void insertRows(final CsvFile csvFile) {
        insertRows(csvFile.getRowList());
    }

    public void insertRows(final List<CsvRecord> rowList) {
        for (CsvRecord csvRecord : rowList) {
            createRow(csvRecord);
        }
    }

    private void createRow(final CsvRecord csvRecord) {
        super.createRow(INSERT_SQL);
    }
}
