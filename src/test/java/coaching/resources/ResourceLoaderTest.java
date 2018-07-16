
package coaching.resources;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Unit tests for ResourceLoader class.
 */
public final class ResourceLoaderTest {

    private static final String CONFIGURATION_PROPERTIES = "Configuration.properties";
    private static final String CONFIGURATION_XML = "Configuration.xml";
    private static final String MISSING_RESOURCE = "missing.resource";

    /** Provides logging. */
    private static final Logger LOG = LoggerFactory
        .getLogger(ResourceLoaderTest.class);

    /**
     * Unit test to get stream.
     *
     * @throws IOException Signals that an I/O exception has occurred.
     */
    @Test
    public void testGetResource() throws IOException {
        InputStream inStream = ResourceLoader
            .getStream(CONFIGURATION_PROPERTIES);
        assertNotNull(inStream);
        assertTrue(inStream.available() > 0);
        LOG.debug("ResourceLoader.getStream = {}", inStream.toString());
    }

    /**
     * Unit test to get stream.
     *
     * @throws IOException Signals that an I/O exception has occurred.
     */
    @Test
    public void testGetXmlResource() throws IOException {
        InputStream inStream = ResourceLoader.getStream(CONFIGURATION_XML);
        assertNotNull(inStream);
        assertTrue(inStream.available() > 0);
        LOG.debug("ResourceLoader.getStream = {}", streamToString(inStream));
    }

    private String streamToString(final InputStream inStream) {
        Scanner s = new Scanner(inStream).useDelimiter("\\A");
        String string = s.hasNext() ? s.next() : "";
        s.close();
        return string;
    }

    /**
     * Unit test to get missing stream.
     *
     * @throws Exception the exception
     */
    @Test(expected = ResourceNotLoadedException.class)
    public void testMissingXmlResource() {
        InputStream inStream = ResourceLoader.getStream(MISSING_RESOURCE);
        assertNotNull(inStream);
    }

}
