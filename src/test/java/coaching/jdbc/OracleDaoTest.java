
package coaching.jdbc;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Unit tests for OracleDao.
 */
@Ignore("Requires Oracle DB availability work-in-progress low-priority")
public final class OracleDaoTest {

    /** SQL to drop the table. */
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
     * Test OracleDao default constructor.
     */
    @Test
    public void testOracleDao() throws ClassNotFoundException {
        final DaoInterface dao = new OracleDao();
        assertNotNull(dao);
    }

    /**
     * Test create.
     */
    @Test
    public void testCreate() throws ClassNotFoundException {
        final OracleDao oracleDao = new OracleDao();
        assertNotNull(oracleDao);
        oracleDao.create(INSERT_SQL);
    }

    /**
     * Test read.
     */
    @Test
    public void testRead() throws ClassNotFoundException {
        final OracleDao oracleDao = new OracleDao();
        assertNotNull(oracleDao);
        oracleDao.read(SELECT_SQL);
    }

    /**
     * Test update.
     */
    @Test
    public void testUpdate() throws ClassNotFoundException {
        final OracleDao oracleDao = new OracleDao();
        assertNotNull(oracleDao);
        oracleDao.update(UPDATE_SQL);
    }

    /**
     * Test delete.
     */
    @Test
    public void testDelete() throws ClassNotFoundException {
        final OracleDao oracleDao = new OracleDao();
        assertNotNull(oracleDao);
        oracleDao.delete(DELETE_SQL);
    }

}
