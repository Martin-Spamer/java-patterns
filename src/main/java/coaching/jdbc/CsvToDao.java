
package coaching.jdbc;

/**
 * Provides a example of a crude XML DAO reader.
 *
 * @author martin.spamer
 * @version 0.1 - 12:33:20
 */
public final class CsvToDao extends AbstractDao {

    /** The classname of the JDBC driver to use. */
    public static final String JDBC_DRIVER = "org.sqlite.JDBC";

    /** The URL to use to make JDBC connection. */
    public static final String JDBC_URL = "jdbc:sqlite:memory";

    /** USERNAME. */
    public static final String USERNAME = "username";

    /** PASSWORD. */
    private static final String PASSWORD = "password";

    /**
     * Default Constructor.
     */
    public CsvToDao() {
        super();
    }

    /**
     * CSV file to DAO.
     *
     * @param driverClassName the driver class name
     * @throws ClassNotFoundException
     */
    public CsvToDao(final String driverClassName)
            throws ClassNotFoundException {
        super(driverClassName);
    }

}
