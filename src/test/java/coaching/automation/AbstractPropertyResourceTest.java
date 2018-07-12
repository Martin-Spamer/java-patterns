
package coaching.automation;

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

    /** Provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(AbstractPropertyResourceTest.class);

    /**
     * The Class MockPropertyResource.
     */
    public class MockPropertyResource extends AbstractPropertyResource {
    }

    /**
     * Unit test to abstract data.
     */
    @Test
    public void testAbstractData() {
        PropertyInterface mock = new MockPropertyResource();
        assertNotNull(mock);
        LOG.info(mock.toString());
    }

    /**
     * Unit test to load string.
     *
     * @throws Exception the exception
     */
    @Test
    public void testLoadString() throws Exception {
        // Given
        PropertyInterface mock = new MockPropertyResource().load("Configuration.properties");
        assertNotNull(mock);
        LOG.info(mock.toString());
    }

    /**
     * Unit test to load stream.
     *
     * @throws Exception the exception
     */
    @Test
    public void testLoadStream() throws Exception {
        // Given
        final Class<? extends AbstractPropertyResourceTest> thisClass = this.getClass();
        final InputStream inStream = thisClass.getResourceAsStream("Configuration.properties");
        PropertyInterface mock = new MockPropertyResource().load(inStream);
        assertNotNull(mock);
        LOG.info(mock.toString());
    }

    /**
     * Unit test to load from XML.
     *
     * @throws Exception the exception
     */
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

    /**
     * Unit test to load null string.
     *
     * @throws Exception the exception
     */
    @Test
    public void testLoadNullString() throws Exception {
        MockPropertyResource mock = new MockPropertyResource();
        final String nullString = null;
        mock.load(nullString);
    }

    /**
     * Unit test to load null stream.
     *
     * @throws Exception the exception
     */
    @Test
    public void testLoadNullStream() throws Exception {
        MockPropertyResource mock = new MockPropertyResource();
        final InputStream nullStream = null;
        mock.load(nullStream);
    }

    /**
     * Unit test to size.
     */
    @Test
    public void testSize() {
        new MockPropertyResource().size();
    }

    /**
     * Unit test to set get property.
     */
    @Test
    public void testSetGetProperty() {
        final MockPropertyResource testData = new MockPropertyResource();
        final String key = "key";
        final String value = "value";
        testData.setProperty(key, value);
        final String actual = testData.getProperty(key);
        assertEquals(value, actual);
    }

    /**
     * Unit test to get property string string.
     */
    @Test
    public void testGetPropertyStringString() {
        final MockPropertyResource testData = new MockPropertyResource();
        final String key = "key";
        final String defaultValue = "value";
        final String actual = testData.getProperty(key, defaultValue);
        assertEquals(defaultValue, actual);
    }

}
