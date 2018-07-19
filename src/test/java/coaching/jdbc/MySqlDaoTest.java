
package coaching.jdbc;

import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Unit tests for MySqlDao.
 */
@Ignore("Requires MySQL DB availability work-in-progress low-priority")
public final class MySqlDaoTest {

    /** LOG 			constant. */
    private static final Logger LOG = LoggerFactory
        .getLogger(MySqlDaoTest.class);

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
     * Test the default constructor with typical usage.
     *
     * @throws ClassNotFoundException the class not found exception
     */
    @Test
    public void testMySqlDao() throws ClassNotFoundException {
        final MySqlDao dao = new MySqlDao();
        assertNotNull(dao);
        LOG.info(dao.toString());
    }

    /**
     * Test create.
     *
     * @throws ClassNotFoundException the class not found exception
     */
    @Test
    public void testCreate() throws ClassNotFoundException {
        final MySqlDao dao = new MySqlDao();
        assertNotNull(dao);
        LOG.info(dao.toString());
        dao.create(INSERT_SQL);
    }

    /**
     * Test read.
     *
     * @throws ClassNotFoundException the class not found exception
     */
    @Test
    public void testRead() throws ClassNotFoundException {
        final MySqlDao dao = new MySqlDao();
        assertNotNull(dao);
        LOG.info(dao.toString());

        dao.read(SELECT_SQL);
    }

    /**
     * Test update.
     *
     * @throws ClassNotFoundException the class not found exception
     */
    @Test
    public void testUpdate() throws ClassNotFoundException {
        final MySqlDao dao = new MySqlDao();
        assertNotNull(dao);
        LOG.info(dao.toString());
        dao.update(UPDATE_SQL);
    }

    /**
     * Test delete.
     *
     * @throws ClassNotFoundException the class not found exception
     */
    @Test
    public void testDelete() throws ClassNotFoundException {
        final MySqlDao dao = new MySqlDao();
        assertNotNull(dao);
        LOG.info(dao.toString());
        dao.delete(DELETE_SQL);
    }

}
