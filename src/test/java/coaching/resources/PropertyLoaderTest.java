
package coaching.resources;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PropertyLoaderTest {

    /**
     * ConfigurationLoader class.
     */
    public class ConfigurationLoader extends PropertiesLoader {
        public ConfigurationLoader() {
            super("./Configuration.properties");
        }
    }

    /**
     * Unit test to typical usage.
     */
    @Test
    public void testTypicalUsage() {
        // Given a resource file exists called ResourceLoader.properties

        // When
        final PropertiesLoader propertiesLoader = new PropertiesLoader();

        // Then
        assertNotNull(propertiesLoader);
        assertTrue(propertiesLoader.isLoaded());
    }

    /**
     * Unit test to typical usage specific properties.
     */
    @Test
    public void testTypicalUsageSpecificProperties() {
        // Given a resource file exists called SpecificResource.properties

        // When
        final ResourceLoader resourceLoader = new ConfigurationLoader();

        // Then
        assertNotNull(resourceLoader);
        assertTrue(resourceLoader.isLoaded());
    }

    @Test
    public void testType() throws Exception {
        assertThat(PropertiesLoader.class, notNullValue());
    }

}
