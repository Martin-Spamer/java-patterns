
package coaching.csv;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit tests for the CsvToDao class.
 */
@Slf4j
public class CsvToDaoTest {

    /**
     * Unit test the CsvToDao class.
     */
    @Test
    @Ignore("Requires Database work-in-progress low-priority")
    public void testCsvToDao() {
        AbstractCsvSource dao = new CsvToDao();
        assertNotNull(dao);
        log.info("dao : {}", dao);
    }

}
