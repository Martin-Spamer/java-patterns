
package coaching.jdbc;

import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Unit test class for DynamicDao.
 */
public class DynamicDaoTest {

    /**  provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(DynamicDaoTest.class);

    /**
     * Unit test to DynamicDAO, data access object.
     *
     * @throws Exception the exception
     */
    @Test
    public void testDynamicDao() throws Exception {
        final DynamicDao dao = new DynamicDao();
        assertNotNull(dao);
        LOG.info("{}", dao);
        dao.process();
        List<String> columnLabels = dao.columnLabels();
        LOG.info("{}", columnLabels);
        final String bodyToString = dao.bodyToString();
        LOG.info("{}", bodyToString);
    }

}
