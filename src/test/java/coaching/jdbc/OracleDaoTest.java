
package coaching.jdbc;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit tests for OracleDao.
 */
@Ignore("Requires Oracle DB availability work-in-progress low-priority")
@Slf4j
public final class OracleDaoTest {

    /**
     * Test OracleDao default constructor.
     */
    @Test
    public void testOracleDao() {
        final DaoInterface dao = new OracleDao();
        assertNotNull(dao);
    }

    /**
     * Test create.
     */
    @Test
    public void testCreate() {
        final OracleDao oracleDao = new OracleDao();
        assertNotNull(oracleDao);
        oracleDao.createRow();
    }

    /**
     * Test read.
     */
    @Test
    public void testRead() {
        final OracleDao oracleDao = new OracleDao();
        assertNotNull(oracleDao);
        oracleDao.readRow();
    }

    /**
     * Test update.
     */
    @Test
    public void testUpdate() {
        final OracleDao oracleDao = new OracleDao();
        assertNotNull(oracleDao);
        oracleDao.updateRow();
    }

    /**
     * Test delete.
     */
    @Test
    public void testDelete() {
        final OracleDao oracleDao = new OracleDao();
        assertNotNull(oracleDao);
        oracleDao.deleteRow();
    }

}
