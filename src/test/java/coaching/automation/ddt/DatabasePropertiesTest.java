
package coaching.automation.ddt;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class DatabasePropertiesTest {

    @Test
    public void testDatabaseProperties() {
        final DatabaseProperties databaseProperties = new DatabaseProperties();
        assertNotNull(databaseProperties);
    }

}
