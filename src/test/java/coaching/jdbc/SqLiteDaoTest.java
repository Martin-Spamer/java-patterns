
package coaching.jdbc;

import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Unit tests for PointbaseDao class.
 */
@Ignore("Requires PointBase DB availability work-in-progress low-priority")
public final class SqLiteDaoTest {

    /** Provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(SqLiteDaoTest.class);

    /**
     * Unit test to sq lite dao.
     *
     * @throws ClassNotFoundException the class not found exception
     */
    @Test
    public void testSqLiteDao() throws ClassNotFoundException {
        final DaoInterface dao = new SqLiteDao();
        assertNotNull(dao);
        LOG.info("dao : {} ", dao.toString());
    }

    /**
     * Unit test to typical.
     *
     * @throws Exception the exception
     */
    @Test
    public void testTypical() throws Exception {
        final SqLiteDao dao = new SqLiteDao();
        assertNotNull(dao);

        assertEquals(dao, dao.createRow());
        assertEquals(dao, dao.readRow());
        assertEquals(dao, dao.updateRow());
        assertEquals(dao, dao.deleteRow());
    }
}
