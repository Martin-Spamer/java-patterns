
package coaching.resources;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Unit tests for ResourceLoader class.
 */
public class ResourceLoaderTest {

    /** Provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(ResourceLoaderTest.class);

    /**
     * Unit test to get file.
     *
     * @throws Exception the exception
     */
    @Test
    public void testGetFile() throws Exception {
        File file = ResourceLoader.getFile("./Configuration.properties");
        assertNotNull(file);
        LOG.info(file.toString());
    }

    /**
     * Unit test to get stream.
     *
     * @throws Exception the exception
     */
    @Test
    public void testGetStream() throws Exception {
        InputStream inStream = ResourceLoader.getStream("Configuration.properties");
        assertNotNull(inStream);
        assertTrue(inStream.available() > 0);
        LOG.info(inStream.toString());
    }

    /**
     * Unit test to get missing file.
     *
     * @throws Exception the exception
     */
    @Test(expected = FileNotFoundException.class)
    public void testGetMissingFile() throws Exception {
        File file = ResourceLoader.getFile("missing.resource");
        assertNotNull(file);
        LOG.info(file.toString());
    }

    /**
     * Unit test to get missing stream.
     *
     * @throws Exception the exception
     */
    @Test(expected = FileNotFoundException.class)
    public void testGetMissingStream() throws Exception {
        InputStream inStream = ResourceLoader.getStream("missing.resource");
        assertNotNull(inStream);
        LOG.info(inStream.toString());
    }

}
