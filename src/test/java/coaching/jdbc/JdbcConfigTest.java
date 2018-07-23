
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

    @Test
    public void testGetInstance() {
        final JdbcConfig instance = JdbcConfig.getInstance();
        assertNotNull(instance);
        LOG.info("{}", instance.toString());
    }

    @Test
    public void testValues() {
        final JdbcConfig instance = JdbcConfig.getInstance();
        assertNotNull(instance);
        LOG.info("{}", JdbcConfig.driver());
        LOG.info("{}", JdbcConfig.url());
        LOG.info("{}", JdbcConfig.username());
        LOG.info("{}", JdbcConfig.password());
        LOG.info("{}", JdbcConfig.schema());
        LOG.info("{}", JdbcConfig.select());
        LOG.info("{}", JdbcConfig.update());
        LOG.info("{}", JdbcConfig.insert());
        LOG.info("{}", JdbcConfig.delete());
    }

}
