
package coaching.jdbc;

/**
 * class CachedTable.
 */
public class CachedTable extends AbstractDataAccessObject {

    /** The Constant JDBC_DRIVER. */
    private static final String JDBC_DRIVER = "com.pointbase.jdbc.jdbcUniversalDriver";

    /** The Constant JDBC_URL. */
    private static final String JDBC_URL = "jdbc:pointbase://localhost:9092/sample";

    /** The Constant USERNAME. */
    private static final String USERNAME = "pbpublic";

    /** The Constant PASSWORD. */
    private static final String PASSWORD = "pbpublic";

    /**
     * Instantiates a new cached table.
     */
    public CachedTable() {
        super(JDBC_DRIVER, JDBC_URL, USERNAME, PASSWORD);
    }

}
