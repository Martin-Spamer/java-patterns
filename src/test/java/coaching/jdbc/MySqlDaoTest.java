
package coaching.jdbc;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit tests for MySqlDao.
 */
@Ignore("Requires MySQL DB availability work-in-progress low-priority")


/** The Constant 			log. */
@Slf4j
public final class MySqlDaoTest {

    /**
     * Test the default constructor with typical usage.
     */
    @Test
    public void testMySqlDao() {
        final MySqlDao dao = new MySqlDao();
        assertNotNull(dao);
        log.info("dao : {}", dao.toString());
    }

    /**
     * Test create.
     */
    @Test
    public void testCreate() {
        final MySqlDao dao = new MySqlDao();
        assertNotNull(dao);
        log.info("dao : {}", dao.toString());
        dao.createRow();
    }

    /**
     * Test read.
     */
    @Test
    public void testRead() {
        final MySqlDao dao = new MySqlDao();
        assertNotNull(dao);
        log.info("dao : {}", dao.toString());
        dao.readRow();
    }

    /**
     * Test update.
     */
    @Test
    public void testUpdate() {
        final MySqlDao dao = new MySqlDao();
        assertNotNull(dao);
        log.info("dao : {}", dao.toString());
        dao.updateRow();
    }

    /**
     * Test delete.
     */
    @Test
    public void testDelete() {
        final MySqlDao dao = new MySqlDao();
        assertNotNull(dao);
        log.info("dao : {}", dao.toString());
        dao.deleteRow();
    }

}
