
package coaching.jdbc;

import lombok.extern.slf4j.Slf4j;

/**
 * A Data Access object for Pointbase Database.
 */
@Slf4j
public class PointbaseDao extends AbstractDao {

    /** JDBC_DRIVER. */
    private static final String JDBC_DRIVER = "com.pointbase.jdbc.jdbcUniversalDriver";

    /** DEFAULT JDBC_URL. */
    private final static String JDBC_URL = "jdbc:pointbase://localhost:9092/sample";

    /** USERNAME. */
    private final static String USERNAME = "PBPUBLIC";

    /** PASSWORD. */
    private final static String PASSWORD = "PBPUBLIC";

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
     * Instantiates a new pointbase dao.
     */
    public PointbaseDao() {
        super(JDBC_DRIVER, JDBC_URL, USERNAME, PASSWORD);
    }

}
