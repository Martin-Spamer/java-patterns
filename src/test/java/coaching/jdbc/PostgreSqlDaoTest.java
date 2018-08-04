
package coaching.jdbc;

import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Unit tests for PostgreSqlDao class.
 */
@Ignore("Requires PostgreSqlDao DB availability work-in-progress low-priority")
public final class PostgreSqlDaoTest {

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

    /** Provides logging. */
    private static final Logger LOG = LoggerFactory
        .getLogger(PostgreSqlDaoTest.class);

    /** The Constant JDBC_DRIVER. */
    private static final String JDBC_DRIVER = "com.pointbase.jdbc.jdbcUniversalDriver";

    /** The Constant JDBC_URL. */
    private final static String JDBC_URL = "jdbc:pointbase://localhost:9092/sample";

    /** The Constant USERNAME. */
    private final static String USERNAME = "PBPUBLIC";

    /** The Constant PASSWORD. */
    private final static String PASSWORD = "PBPUBLIC";

    /**
     * Unit Test to point base customer dao.
     *
     * @throws ClassNotFoundException the class not found exception
     */
    @Test
    public void testPointBaseCustomerDao() throws ClassNotFoundException {
        final DaoInterface dao = new PostgresSqlDao();
        assertNotNull(dao);
    }

    /**
     * Unit Test to point base customer dao url user password.
     *
     * @throws ClassNotFoundException the class not found exception
     */
    @Test
    public void testPointBaseCustomerDaoTypical()
            throws ClassNotFoundException {
        PostgresSqlDao dao = new PostgresSqlDao();
        assertNotNull(dao);
        dao.createRow(INSERT_SQL);
        dao.readRows(SELECT_SQL);
        dao.updateRow(UPDATE_SQL);
        dao.deleteRow(DELETE_SQL);
    }
}
