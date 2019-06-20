
package coaching.jdbc;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit tests for PointbaseDao class.
 */
@Ignore("Requires PointBase DB availability work-in-progress low-priority")


/** The Constant 			log. */
@Slf4j
public final class SqLiteDaoTest {

    /**
     * Unit test to sq lite dao.
     * 
     * The not found exception
     *
     * @throws ClassNotFoundException the class not found exception
     */
    @Test
    public void testSqLiteDao() throws ClassNotFoundException {
        final DaoInterface dao = new SqLiteDao();
        assertNotNull(dao);
        log.info("dao : {} ", dao.toString());
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
