
package coaching.jdbc;

/**
 * A Data Access object for Pointbase Database.
 */
public final class PointbaseDao extends AbstractDao {

    /** The classname of the JDBC driver to use. */
    private static final String JDBC_DRIVER = "com.pointbase.jdbc.jdbcUniversalDriver";

    /** The URL to use to make JDBC connection. */
    private static final String JDBC_URL = "jdbc:pointbase:server://localhost/sample";

    /** USERNAME to be used. */
    private static final String USERNAME = "PBPUBLIC";

    /** PASSWORD to be used. */
    private static final String PASSWORD = "PBPUBLIC";

    /**
     * Instantiates a new DAO for Pointbase database.
     *
     * @throws ClassNotFoundException
     */
    public PointbaseDao() throws ClassNotFoundException {
        super(JDBC_DRIVER, JDBC_URL, USERNAME, PASSWORD);
    }

}
