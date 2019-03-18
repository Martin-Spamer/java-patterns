
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

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(MySqlDaoTest.class);

    /**
     * Test the default constructor with typical usage.
     */
    @Test
    public void testMySqlDao() {
        final MySqlDao dao = new MySqlDao();
        assertNotNull(dao);
        LOG.info("dao : {}", dao.toString());
    }

    /**
     * Test create.
     */
    @Test
    public void testCreate() {
        final MySqlDao dao = new MySqlDao();
        assertNotNull(dao);
        LOG.info("dao : {}", dao.toString());
        dao.createRow();
    }

    /**
     * Test read.
     */
    @Test
    public void testRead() {
        final MySqlDao dao = new MySqlDao();
        assertNotNull(dao);
        LOG.info("dao : {}", dao.toString());
        dao.readRow();
    }

    /**
     * Test update.
     */
    @Test
    public void testUpdate() {
        final MySqlDao dao = new MySqlDao();
        assertNotNull(dao);
        LOG.info("dao : {}", dao.toString());
        dao.updateRow();
    }

    /**
     * Test delete.
     */
    @Test
    public void testDelete() {
        final MySqlDao dao = new MySqlDao();
        assertNotNull(dao);
        LOG.info("dao : {}", dao.toString());
        dao.deleteRow();
    }

}
