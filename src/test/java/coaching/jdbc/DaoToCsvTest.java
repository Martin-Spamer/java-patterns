
package coaching.jdbc;

import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit tests the CsvToJdbc class.
 */
@Slf4j
public final class DaoToCsvTest {

    /**
     * Unit test to jdbc to csv.
     *
     * @throws Exception the exception
     */
    @Test
    @Ignore("Requires Database work-in-progress low-priority")
    public void testJdbcToCsv() throws Exception {
        DaoToCsv dao = new DaoToCsv();
        assertNotNull(dao);
        log.info("dao : {}", dao);
    }

}
