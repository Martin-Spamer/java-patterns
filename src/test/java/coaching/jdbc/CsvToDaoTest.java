
package coaching.jdbc;

import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit test class for CsvToDao.
 */


@Slf4j
public class CsvToDaoTest {

    /**
     * Unit test to csv to dao.
     */
    @Test
    @Ignore("Requires Database work-in-progress low-priority")
    public void testCsvToDao() {
        CsvToDao dao = new CsvToDao();
        assertNotNull(dao);
        log.info("dao : {}", dao);
    }

}
