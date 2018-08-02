
package coaching.jdbc;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Unit test class for DynamicDao.
 */
public class DynamicDaoTest {

    /** provides logging */
    private static final Logger LOG = LoggerFactory
        .getLogger(DynamicDaoTest.class);

    /**
     * Unit test to DynamicDAO, data access object.
     */
    @Test
    public void testDynamicDao() {
        final DynamicDao dao = new DynamicDao();
        assertNotNull(dao);
        LOG.info("{}", dao);
        dao.process();
    }

}
