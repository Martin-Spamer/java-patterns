
package coaching.jdbc;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit tests the CsvToJdbc class.
 */



@Slf4j
public final class DaoToJsonTest {

    /**
     * Unit test to jdbc to csv.
     *
     * @throws Exception the exception
     */
    @Test
    @Ignore("Requires Database work-in-progress low-priority")
    public void testDaoToXml() throws Exception {
        final DaoToXml dao = new DaoToXml();
        assertNotNull(dao);
        log.info("dao : {}", dao.toString());
    }

}
