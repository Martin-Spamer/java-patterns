
package coaching.jdbc;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Unit test class for JdbcConfig.
 */
public class JdbcConfigTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory
        .getLogger(JdbcConfigTest.class);

    /**
     * Unit test to get instance.
     */
    @Test
    public void testGetInstance() {
        final JdbcConfig instance = JdbcConfig.getInstance();
        assertNotNull(instance);
        LOG.info("{}", instance.toString());
    }

}
