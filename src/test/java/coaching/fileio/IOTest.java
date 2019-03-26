
package coaching.fileio;

import java.io.File;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import coaching.resources.ResourceLoader;

public class IOTest {

    private static String TEST_FILENAME = "src/test/resources/Configuration.properties";

    @Test
    public void testFromFilename() throws Exception {
        assertNotNull(IO.from(TEST_FILENAME));
    }

    @Test
    public void testFromInputStream() throws Exception {
        assertNotNull(IO.from(ResourceLoader.getStream("Configuration.properties")));
    }

    @Test
    public void testScanLinesFromString() throws Exception {
        IO.scanLinesFrom(TEST_FILENAME);
    }

    @Test
    public void testScanLinesFromFile() throws Exception {
        IO.scanLinesFrom(new File(TEST_FILENAME));
    }

    @Test
    public void testScan() throws Exception {
        IO.scan(TEST_FILENAME);
    }

    @Test
    public void testLoad() throws Exception {
        IO.load(TEST_FILENAME);
    }

}
