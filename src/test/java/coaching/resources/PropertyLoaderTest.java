
package coaching.resources;

import java.util.Properties;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Unit tests for PropertyLoader class.
 */
public final class PropertyLoaderTest {
    private static final String CONFIGURATION_PROPERTIES = "Configuration.properties";
    private static final String CONFIGURATION_XML = "Configuration.xml";
    private static final String MISSING_PROPERTIES = "missing.resource";

    /** Provides logging. */
    private static final Logger LOG = LoggerFactory
        .getLogger(PropertyLoaderTest.class);

    /**
     * Unit test to get properties.
     */
    @Test
    public void testGetProperties() {
        Properties properties = PropertiesLoader
            .getProperties(CONFIGURATION_PROPERTIES);
        assertNotNull(properties);
        LOG.info(properties.toString());
    }

    /**
     * Unit test to get xml properties.
     */
    @Test
    public void testGetXmlProperties() {
        Properties properties = PropertiesLoader
            .getXmlProperties(CONFIGURATION_XML);
        assertNotNull(properties);
        LOG.info(properties.toString());
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

}
