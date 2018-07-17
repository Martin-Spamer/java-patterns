
package coaching.jdbc;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class JdbcConfigTest {

    @Test
    public void testGetInstance() {
        final JdbcConfig instance = JdbcConfig.getInstance();
        assertNotNull(instance);
    }

}
