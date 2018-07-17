
package coaching.jdbc;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class DynamicDaoTest {

    @Test
    public void testDynamicDao() {
        final DynamicDao dynamicDao = new DynamicDao();
        assertNotNull(dynamicDao);
        dynamicDao.process();
    }

}
