
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
    private static final String MISSING_RESOURCE = "Resource.missing";

    /** Provides logging. */
    private static final Logger LOG = LoggerFactory
        .getLogger(ResourceLoaderTest.class);

    /**
     * Unit test to get stream.
     *
     * @throws IOException Signals that an I/O exception has occurred while
     *             reading the stream.
     */
    @Test
    public void testGetResource() throws IOException {
        InputStream inputStream = ResourceLoader
            .getStream(CONFIGURATION_PROPERTIES);
        assertNotNull(inputStream);
        assertTrue(inputStream.available() > 0);
        LOG.debug("ResourceLoader.getStream = {}", inputStream.toString());
    }

    /**
     * Unit test to get stream.
     *
     * @throws IOException Signals that an I/O exception has occurred while
     *             reading the stream.
     */
    @Test
    public void testGetXmlResource() throws IOException {
        InputStream inputStream = ResourceLoader.getStream(CONFIGURATION_XML);
        assertNotNull(inputStream);
        assertTrue(inputStream.available() > 0);
        LOG.debug("ResourceLoader.getStream = {}", streamToString(inputStream));
    }

    /**
     * Unit test to get missing stream.
     *
     * @throws IOException Signals that an I/O exception has occurred while
     *             reading the stream.
     */
    @Test(expected = ResourceNotLoadedException.class)
    public void testMissingXmlResource() throws IOException {
        InputStream inputStream = ResourceLoader.getStream(MISSING_RESOURCE);
        assertNotNull(inputStream);
        assertTrue(inputStream.available() > 0);
        LOG.debug("ResourceLoader.getStream = {}", streamToString(inputStream));
    }

    private String streamToString(final InputStream inputStream) {
        Scanner s = new Scanner(inputStream).useDelimiter("\\A");
        String string = s.hasNext() ? s.next() : "";
        s.close();
        return string;
    }

}
