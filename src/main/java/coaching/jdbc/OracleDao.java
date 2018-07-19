
package coaching.jdbc;

/**
 * A Data Access object for an Oracle Database.
 */
public final class OracleDao extends AbstractDao {

    /** The classname of the JDBC driver to use. */
    private static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";

    /** The URL to use to make JDBC connection. */
    private static final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:sample";

    /** USERNAME to be used. */
    private static final String USERNAME = "user";

    /** PASSWORD to be used. */
    private static final String PASSWORD = "password";

    /**
     * Instantiates a new DAO for Oracle.
     *
     * @throws ClassNotFoundException the class not found exception
     */
    public OracleDao() throws ClassNotFoundException {
        super(JDBC_DRIVER, JDBC_URL, USERNAME, PASSWORD);
    }

}
