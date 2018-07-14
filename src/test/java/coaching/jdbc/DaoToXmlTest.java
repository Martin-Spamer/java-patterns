
package coaching.jdbc;

import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Unit tests the CsvToJdbc class.
 */
public final class DaoToXmlTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(DaoToXmlTest.class);

    /**
     * Unit test to jdbc to csv.
     *
     * @throws Exception the exception
     */
    @Test
    @Ignore("Requires Database")
    public void testDaoToXml() throws Exception {
        final DaoToXml instance = new DaoToXml();
        assertNotNull(instance);
        LOG.info(instance.toString());
    }

}
