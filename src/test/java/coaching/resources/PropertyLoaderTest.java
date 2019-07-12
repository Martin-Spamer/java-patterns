
package coaching.resources;

import java.util.Properties;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit tests for PropertyLoader class.
 */
@Slf4j
public final class PropertyLoaderTest {

    private static final String CONFIGURATION_PROPERTIES = "Configuration.properties";
    private static final String CONFIGURATION_XML = "Configuration.xml";
    private static final String MISSING_PROPERTIES = "Missing";

    /**
     * Unit test to get properties.
     */
    @Test
    public void testGetProperties() {
        final Properties properties = PropertiesLoader.getProperties(CONFIGURATION_PROPERTIES);
        assertNotNull(properties);
        assertTrue(properties.size() > 0);
        log.info(properties.toString());
    }

    /**
     * Unit test to get xml properties.
     */
    @Test
    public void testGetXmlProperties() {
        final Properties properties = PropertiesLoader.getXmlProperties(CONFIGURATION_XML);
        assertNotNull(properties);
        assertTrue(properties.size() > 0);
        log.info(properties.toString());
    }

    /**
     * Unit test to missing file.
     */
    @Test(expected = ResourceNotLoadedException.class)
    public void testMissingProperties() {
        PropertiesLoader.getProperties(MISSING_PROPERTIES);
    }

    /**
     * Unit test to missing xml file.
     */
    @Test(expected = ResourceNotLoadedException.class)
    public void testMissingXmlProperties() {
        PropertiesLoader.getXmlProperties(MISSING_PROPERTIES);
    }

    /**
     * Unit test to null properties.
     */
    public void testNullProperties() {
        PropertiesLoader.getXmlProperties(null);
    }
}
