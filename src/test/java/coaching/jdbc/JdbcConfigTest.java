
package coaching.jdbc;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

public class JdbcConfigTest {

    private static final Logger LOG = LoggerFactory
        .getLogger(JdbcConfigTest.class);

    @Test
    public void testGetInstance() {
        final JdbcConfig instance = JdbcConfig.getInstance();
        assertNotNull(instance);
        LOG.info("{}", instance.toString());
    }

}
