
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
    private static final Logger LOG = LoggerFactory.getLogger(JdbcConfigTest.class);

    /**
     * Unit test to get instance.
     */
    @Test
    public void testGetInstance() {
        final JdbcConfig instance = JdbcConfig.getInstance();
        assertNotNull(instance);
        LOG.info("{}", instance.toString());
    }

    /**
     * Unit test to values.
     */
    @Test
    public void testValues() {
        final JdbcConfig instance = JdbcConfig.getInstance();
        assertNotNull(instance);
        LOG.info("\tJdbcConfig.driver() : {}", JdbcConfig.driver());
        LOG.info("\tJdbcConfig.url() : {}", JdbcConfig.url());
        LOG.info("\tJdbcConfig.username() : {}", JdbcConfig.username());
        LOG.info("\tJdbcConfig.password() : {}", JdbcConfig.password());
        LOG.info("\tJdbcConfig.schema() : {}", JdbcConfig.schema());
        LOG.info("\tJdbcConfig.select() : {}", JdbcConfig.select());
        LOG.info("\tJdbcConfig.update() : {}", JdbcConfig.update());
        LOG.info("\tJdbcConfig.insert() : {}", JdbcConfig.insert());
        LOG.info("\tJdbcConfig.delete() : {}", JdbcConfig.delete());
    }

}
