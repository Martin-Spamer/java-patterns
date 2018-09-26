
package coaching.jdbc;

import java.util.List;

import coaching.csv.CsvRecord;

/**
 * A Data Access object for an Oracle Database.
 */
public class OracleDao extends AbstractDao {

    /** The classname of the JDBC driver to use. */
    private static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";

    /** The URL to use to make JDBC connection. */
    private static final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:sample";

    /** USERNAME to be used. */
    private static final String USERNAME = "user";

    /** PASSWORD to be used. */
    private static final String PASSWORD = "password";

    public OracleDao() {
        super(JDBC_DRIVER, JDBC_URL, USERNAME, PASSWORD);
    }

    @Override
    public void insertRows(final List<CsvRecord> rowList) {
    }

}
