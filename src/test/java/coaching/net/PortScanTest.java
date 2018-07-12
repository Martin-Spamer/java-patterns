
package coaching.net;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * The Class PortScanTest.
 */
public class PortScanTest {

    /** The Constant LOG. */
    private static final Logger LOG = LoggerFactory.getLogger(PortScanTest.class);

    /**
     * Unit test to port scan.
     */
    @Test
    public void testPortScan() {
        LOG.info("testPortScan");
        PortScan portScan = new PortScan();
        assertNotNull(portScan);
        LOG.info(portScan.toString());
    }

    /**
     * Unit test to port scan string int.
     */
    @Test
    public void testPortScanStringInt() {
        LOG.info("testPortScanStringInt");
        PortScan portScan = new PortScan("127.0.0.1", 8080);
        assertNotNull(portScan);
        LOG.info(portScan.toString());
    }

    /**
     * Unit test to port scan null.
     */
    @Test
    public void testPortScanNull() {
        LOG.info("testPortScanNull");
        PortScan portScan = new PortScan(null, 8080);
        assertNotNull(portScan);
    }

    /**
     * Unit test to port scan args.
     */
    @Test
    public void testPortScanArgs() {
        LOG.info("testPortScanArgs");
        String[] args = { "127.0.0.1", "8080" };
        PortScan portScan = new PortScan(args);
        assertNotNull(portScan);
        LOG.info(portScan.toString());
    }

    /**
     * Unit test to port scan null args.
     */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testPortScanNullArgs() {
        LOG.info("testPortScanNullArgs");
        String[] args = {};
        PortScan portScan = new PortScan(args);
        assertNotNull(portScan);
    }

    /**
     * Unit test to port scan empty args.
     */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testPortScanEmptyArgs() {
        LOG.info("testPortScanEmptyArgs");
        String[] args = {};
        PortScan portScan = new PortScan(args);
        assertNotNull(portScan);
    }

    /**
     * Unit test to port scan zero args.
     */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testPortScanZeroArgs() {
        LOG.info("testPortScanZeroArgs");
        String[] args = new String[0];
        PortScan portScan = new PortScan(args);
        assertNotNull(portScan);
    }
}
