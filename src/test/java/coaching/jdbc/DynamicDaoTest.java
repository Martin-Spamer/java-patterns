
package coaching.jdbc;

import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit test class for DynamicDao.
 */
@Slf4j
public class DynamicDaoTest {

    /**
     * Unit test to DynamicDAO, data access object.
     *
     * @throws Exception the exception
     */
    @Test
    public void testDynamicDao() throws Exception {
        final DynamicDao dao = new DynamicDao();
        assertNotNull(dao);
        log.info("dao : {}", dao);
        dao.process();
        List<String> columnLabels = dao.columnLabels();
        log.info("columnLabels : {}", columnLabels);
        final String bodyToString = dao.bodyToString();
        log.info("bodyToString : {}", bodyToString);
    }

}
