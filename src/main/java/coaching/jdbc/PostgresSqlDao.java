
package coaching.jdbc;

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

    /** The classname of the JDBC driver to use. */
    /** SQL to DROP the table. */
    static final String DROP_SQL = "DROP TABLE IF EXISTS {}";

    /** SQL to create the table. */
    static final String CREATE_SQL = "CREATE TABLE customer (id INTEGER, name STRING, details STRING)";

    /** SQL to count the number of rows in the table. */
    static final String COUNT_SQL = "SELECT (*) FROM customer";

    /** SQL to select all rows in the table. */
    static final String SELECT_SQL = "SELECT * FROM customer";

    /** SQL to insert a row in the table. */
    static final String INSERT_SQL = "INSERT INTO customer (ID, NAME, DATA VALUES (999,'...','...')";

    /** SQL to update rows in the table. */
    static final String UPDATE_SQL = "UPDATE TABLE SET FIELD = 'Value' WHERE ID=999";

    /** SQL to delete rows in the table. */
    static final String DELETE_SQL = "DELETE FROM TABLE WHERE ID=999";

    /**
     * Instantiates a new postgres sql dao.
     */
    public PostgresSqlDao() {
        super(JDBC_DRIVER, JDBC_URL, USERNAME, PASSWORD);
    }

}
