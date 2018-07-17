
package coaching.jdbc;

/**
 * A Data Access Object for a Sqlite3 database.
 */
public class SqLiteDao extends AbstractDao {

    /** The classname of the JDBC driver to use. */
    public static final String JDBC_DRIVER = "org.sqlite.JDBC";

    /** The URL to use to make JDBC connection. */
    public static final String JDBC_URL = "jdbc:sqlite:sample.db";

    /** USERNAME. */
    public static final String USERNAME = "username";

    /** PASSWORD. */
    private static final String PASSWORD = "password";

    /**
     * Instantiates a new my SQL DAO.
     *
     * @throws ClassNotFoundException
     */
    public SqLiteDao() throws ClassNotFoundException {
        super(JDBC_DRIVER, JDBC_URL, USERNAME, PASSWORD);
    }

    /**
     * Instantiates a new sq lite dao.
     *
     * @param driverClassName the driver class name
     * @param connectionUrl the connection url
     * @param username the username
     * @param password the password
     * @throws ClassNotFoundException the class not found exception
     */
    public SqLiteDao(final String driverClassName,
            final String connectionUrl,
            final String username,
            final String password) throws ClassNotFoundException {
        super(driverClassName, connectionUrl, username, password);
    }

}
