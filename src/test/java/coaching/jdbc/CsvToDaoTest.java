
package coaching.jdbc;

import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Unit test class for CsvToDao.
 */
public class CsvToDaoTest {

    /** provides logging */
    private static final Logger LOG = LoggerFactory
        .getLogger(CsvToDaoTest.class);

    /**
     * Unit test to csv to dao.
     */
    @Test
    @Ignore("Requires Database work-in-progress low-priority")
    public void testCsvToDao() {
        CsvToDao dao = new CsvToDao();
        assertNotNull(dao);
        LOG.info("{}", dao);
    }

}
