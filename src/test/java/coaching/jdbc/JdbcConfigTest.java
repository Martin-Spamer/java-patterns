
package coaching.jdbc;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit test class for JdbcConfig.
 */
@Slf4j
public class JdbcConfigTest {

    /**
     * Unit test to get instance.
     */
    @Test
    public void testGetInstance() {
        final JdbcConfig instance = JdbcConfig.getInstance();
        assertNotNull(instance);
        log.info("{}", instance.toString());
    }

    /**
     * Unit test to values.
     */
    @Test
    public void testValues() {
        final JdbcConfig instance = JdbcConfig.getInstance();
        assertNotNull(instance);
        log.info("\tJdbcConfig.driver() : {}", JdbcConfig.driver());
        log.info("\tJdbcConfig.url() : {}", JdbcConfig.url());
        log.info("\tJdbcConfig.username() : {}", JdbcConfig.username());
        log.info("\tJdbcConfig.password() : {}", JdbcConfig.password());
        log.info("\tJdbcConfig.schema() : {}", JdbcConfig.schema());
        log.info("\tJdbcConfig.select() : {}", JdbcConfig.select());
        log.info("\tJdbcConfig.update() : {}", JdbcConfig.update());
        log.info("\tJdbcConfig.insert() : {}", JdbcConfig.insert());
        log.info("\tJdbcConfig.delete() : {}", JdbcConfig.delete());
    }

}
