
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

    /** The classname of the JDBC driver to use. */
    private static final String JDBC_DRIVER = "org.postgresql.Driver";

    /** The URL to use to make JDBC connection. */
    private static final String JDBC_URL = "jdbc:postgresql://localhost";

    /** USERNAME to be used. */
    private static final String USERNAME = "postgres";

    /** PASSWORD to be used. */
    private static final String PASSWORD = "password";

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
    private static final Logger LOG = LoggerFactory.getLogger(PostgreSqlDaoTest.class);

    /**
     * Unit Test to point base customer dao.
     */
    @Test
    public void testPostgresSqlDao() {
        final DaoInterface dao = new PostgresSqlDao();
        assertNotNull(dao);
    }

    /**
     * Unit Test to point base customer dao url user password.
     */
    @Test
    public void testPostgresSqlDaoTypical() {
        PostgresSqlDao dao = new PostgresSqlDao();
        assertNotNull(dao);
        dao.createRow(INSERT_SQL);
        dao.readRows(SELECT_SQL);
        dao.updateRow(UPDATE_SQL);
        dao.deleteRow(DELETE_SQL);
    }

}
