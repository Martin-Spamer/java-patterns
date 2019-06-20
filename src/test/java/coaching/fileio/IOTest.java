
package coaching.fileio;

import java.io.File;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import coaching.resources.ResourceLoader;

/**
 * A UnitTest for IO objects.
 */
public class IOTest {

    /** The test filename. */
    private static String TEST_FILENAME = "src/test/resources/Configuration.properties";

    /**
     * test IO object.
     *
     * @throws Exception the exception
     */
    @Test
    public void testFromFilename() throws Exception {
        assertNotNull(IO.from(TEST_FILENAME));
    }

    /**
     * test IO object.
     *
     * @throws Exception the exception
     */
    @Test
    public void testFromInputStream() throws Exception {
        assertNotNull(IO.from(ResourceLoader.getStream("Configuration.properties")));
    }

    /**
     * test IO object.
     *
     * @throws Exception the exception
     */
    @Test
    public void testScanLinesFromString() throws Exception {
        IO.scanLinesFrom(TEST_FILENAME);
    }

    /**
     * test IO object.
     *
     * @throws Exception the exception
     */
    @Test
    public void testScanLinesFromFile() throws Exception {
        IO.scanLinesFrom(new File(TEST_FILENAME));
    }

    /**
     * test IO object.
     *
     * @throws Exception the exception
     */
    @Test
    public void testScan() throws Exception {
        IO.scan(TEST_FILENAME);
    }

    /**
     * test IO object.
     *
     * @throws Exception the exception
     */
    @Test
    public void testLoad() throws Exception {
        IO.load(TEST_FILENAME);
    }

}
