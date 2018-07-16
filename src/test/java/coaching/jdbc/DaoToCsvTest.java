
package coaching.jdbc;

import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Unit tests the CsvToJdbc class.
 */
public final class DaoToCsvTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory
        .getLogger(DaoToCsvTest.class);

    /**
     * Unit test to jdbc to csv.
     *
     * @throws Exception the exception
     */
    @Test
    @Ignore("Requires Database work-in-progress low-priority")
    public void testJdbcToCsv() throws Exception {
        final DaoToCsv instance = new DaoToCsv();
        assertNotNull(instance);
        LOG.info(instance.toString());
    }

}
