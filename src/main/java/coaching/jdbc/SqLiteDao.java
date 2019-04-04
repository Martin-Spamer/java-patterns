
package coaching.jdbc;

import lombok.extern.slf4j.Slf4j;

/**
 * A Data Access Object for a Sqlite3 database.
 */
@Slf4j
public final class SqLiteDao extends AbstractDao {

    /** The classname of the JDBC driver to use. */
    public static final String JDBC_DRIVER = "org.sqlite.JDBC";

    /** The URL to use to make JDBC connection. */
    public static final String JDBC_URL = "jdbc:sqlite:sample.db";

    /** USERNAME. */
    public static final String USERNAME = "username";

    /** PASSWORD. */
    private static final String PASSWORD = "password";

    /** SQL to DROP the table. */
    static final String DROP_SQL = "DROP TABLE IF EXISTS customer";

    /** SQL to create the table. */
    static final String CREATE_SQL = "CREATE TABLE customer (id INTEGER, name STRING, details STRING)";

    /** SQL to count the number of rows in the table. */
    static final String COUNT_SQL = "SELECT (*) FROM customer";

    /** SQL to select all rows in the table. */
    static final String SELECT_SQL = "SELECT * FROM customer";

    /** SQL to insert a row in the table. */
    static final String INSERT_SQL = "INSERT INTO customer (ID, NAME, DATA) VALUES (999,'...','...')";

    /** SQL to update rows in the table. */
    static final String UPDATE_SQL = "UPDATE customer SET FIELD = 'Value' WHERE ID=999";

    /** SQL to delete rows in the table. */
    static final String DELETE_SQL = "DELETE FROM customer WHERE ID=999";

    /**
     * Instantiates a new my SQL DAO.
     *
     * @throws ClassNotFoundException the class not found exception
     */
    public SqLiteDao() throws ClassNotFoundException {
        super(JDBC_DRIVER, JDBC_URL, USERNAME, PASSWORD);
    }

}
