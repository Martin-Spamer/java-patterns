
package coaching.automation.ddt;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Unit test class for DatabaseProperties.
 */
public class DatabasePropertiesTest {

    /**
     * Unit test to database properties.
     */
    @Test
    public void testDatabaseProperties() {
        final DatabaseProperties databaseProperties = new DatabaseProperties();
        assertNotNull(databaseProperties);
    }

}
