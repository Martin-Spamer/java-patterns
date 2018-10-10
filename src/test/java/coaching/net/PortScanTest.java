
package coaching.net;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Unit tests for the PortScan class.
 */
// @Ignore("work-in-progress low-priority")
public final class PortScanTest {

    /** Provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(PortScanTest.class);

    /**
     * Unit test <code>PortScan</code> with defaults.
     */
    @Test
    public void testPortScan() {
        LOG.info("testPortScan");
        final PortScan portScan = new PortScan();
        assertNotNull(portScan);
        LOG.info(portScan.toString());
    }

    /**
     * Unit test <code>PortScan</code> with IP and portNo.
     */
    @Test
    public void testPortScanIpPort() {
        LOG.info("testPortScanIpPort");
        final PortScan portScan = new PortScan("127.0.0.1", 8080);
        assertNotNull(portScan);
        LOG.info(portScan.toString());
    }

    /**
     * Unit test <code>PortScan</code> with null IP.
     */
    @Test(expected = AssertionError.class)
    public void testPortScanNull() {
        LOG.info("testPortScanNull");
        final PortScan portScan = new PortScan(null, 8080);
        assertNotNull(portScan);
    }

    /**
     * Unit test <code>PortScan</code> with String[] arguments.
     */
    @Test
    public void testPortScanArgs() {
        LOG.info("testPortScanArgs");
        final String[] args = { "127.0.0.1", "8080" };
        final PortScan portScan = new PortScan(args);
        assertNotNull(portScan);
        LOG.info(portScan.toString());
    }

    /**
     * Unit test <code>PortScan</code> with null String[] arguments.
     */
    @Test(expected = AssertionError.class)
    public void testPortScanNullArgs() {
        LOG.info("testPortScanNullArgs");
        final String[] args = {};
        final PortScan portScan = new PortScan(args);
        assertNotNull(portScan);
    }

    /**
     * Unit test <code>PortScan</code> with empty String[] arguments.
     */
    @Test(expected = AssertionError.class)
    public void testPortScanEmptyArgs() {
        LOG.info("testPortScanEmptyArgs");
        final String[] args = {};
        final PortScan portScan = new PortScan(args);
        assertNotNull(portScan);
    }

    /**
     * Unit test <code>PortScan</code> with zero String[] arguments.
     */
    @Test(expected = AssertionError.class)
    public void testPortScanZeroArgs() {
        LOG.info("testPortScanZeroArgs");
        final String[] args = new String[0];
        final PortScan portScan = new PortScan(args);
        assertNotNull(portScan);
    }

}
