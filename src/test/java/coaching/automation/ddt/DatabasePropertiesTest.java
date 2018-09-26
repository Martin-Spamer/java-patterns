
package coaching.automation.ddt;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Unit test class for DatabaseProperties.
 */
public class DatabasePropertiesTest {

    private static final String PLATFORM = "dev";
    private static final String TAG = "@AUTHORISED";

    /** provides logging */
    private static final Logger LOG = LoggerFactory
        .getLogger(DatabasePropertiesTest.class);

    /**
     * Unit test to database properties.
     */
    @Test
    public void testDatabaseProperties() {
        final DatabaseProperties databaseProperties = new DatabaseProperties();
        assertNotNull(databaseProperties);
        LOG.info("{}", databaseProperties);
    }

    @Test
    public void testDatabasePropertiesNamed() {
        final DatabaseProperties databaseProperties = new DatabaseProperties(
                PLATFORM);
        assertNotNull(databaseProperties);
        LOG.info("{}", databaseProperties);
    }

}
