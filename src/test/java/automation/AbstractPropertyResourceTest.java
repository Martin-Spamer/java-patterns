
package automation;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Unit test for the abstract property resource class.
 */
public class AbstractPropertyResourceTest {

    private static final Logger LOG = LoggerFactory.getLogger(AbstractPropertyResourceTest.class);

    public class MockPropertyResource extends AbstractPropertyResource {
    }

    @Test
    public void testAbstractData() {
        PropertyInterface mock = new MockPropertyResource();
        assertNotNull(mock);
        LOG.info(mock.toString());
    }

    @Test
    public void testLoadString() throws Exception {
        // Given
        PropertyInterface mock = new MockPropertyResource().load("Configuration.properties");
        assertNotNull(mock);
        LOG.info(mock.toString());
    }

    @Test
    public void testLoadStream() throws Exception {
        // Given
        final Class<? extends AbstractPropertyResourceTest> thisClass = this.getClass();
        final InputStream inStream = thisClass.getResourceAsStream("Configuration.properties");
        PropertyInterface mock = new MockPropertyResource().load(inStream);
        assertNotNull(mock);
        LOG.info(mock.toString());
    }

    @Test
    public void testLoadFromXML() throws Exception {
        // Given
        PropertyInterface mock = new MockPropertyResource().loadFromXML("Configuration.xml");
        assertNotNull(mock);
        LOG.info(mock.toString());

        // When we store
        final OutputStream outStream = new FileOutputStream("./target/ConfigurationFromXml.properties");
        assertNotNull(outStream);
        assertNotNull(mock.store(outStream));
    }

    @Test
    public void testLoadNullString() throws Exception {
        MockPropertyResource mock = new MockPropertyResource();
        final String nullString = null;
        mock.load(nullString);
    }

    @Test
    public void testLoadNullStream() throws Exception {
        MockPropertyResource mock = new MockPropertyResource();
        final InputStream nullStream = null;
        mock.load(nullStream);
    }

    @Test
    public void testSize() {
        new MockPropertyResource().size();
    }

    @Test
    public void testSetGetProperty() {
        final MockPropertyResource testData = new MockPropertyResource();
        final String key = "key";
        final String value = "value";
        testData.setProperty(key, value);
        final String actual = testData.getProperty(key);
        assertEquals(value, actual);
    }

    @Test
    public void testGetPropertyStringString() {
        final MockPropertyResource testData = new MockPropertyResource();
        final String key = "key";
        final String defaultValue = "value";
        final String actual = testData.getProperty(key, defaultValue);
        assertEquals(defaultValue, actual);
    }

}
