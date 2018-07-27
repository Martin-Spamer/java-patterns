
package coaching.jdbc;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Unit test class for DynamicDao.
 */
public class DynamicDaoTest {

    /**
     * Unit test to dynamic dao.
     */
    @Test
    public void testDynamicDao() {
        final DynamicDao dynamicDao = new DynamicDao();
        assertNotNull(dynamicDao);
        dynamicDao.process();
    }

}
