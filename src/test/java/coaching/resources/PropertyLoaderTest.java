
package coaching.resources;

import java.io.FileNotFoundException;
import java.util.Properties;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Unit tests for PropertyLoader class.
 */
public class PropertyLoaderTest {

    private static final Logger LOG = LoggerFactory.getLogger(PropertyLoaderTest.class);

    @Test
    public void testGetProperties() throws Exception {
        Properties properties = PropertiesLoader.getProperties("Configuration.properties");
        assertNotNull(properties);
        LOG.info(properties.toString());
    }

    @Test
    public void testGetXmlProperties() throws Exception {
        Properties properties = PropertiesLoader.getXmlProperties("Configuration.xml");
        assertNotNull(properties);
        LOG.info(properties.toString());
    }

    @Test(expected = FileNotFoundException.class)
    public void testMissingFile() throws Exception {
        Properties properties = PropertiesLoader.getProperties("missing.properties");
        assertNotNull(properties);
        LOG.info(properties.toString());
    }

    @Test(expected = FileNotFoundException.class)
    public void testMissingXmlFile() throws Exception {
        Properties properties = PropertiesLoader.getXmlProperties("missing.xml");
        assertNotNull(properties);
        LOG.info(properties.toString());
    }

}
