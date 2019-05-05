
package coaching.net;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit tests for the PortScan class.
 */
// @Ignore("work-in-progress low-priority")


@Slf4j
public final class PortScanTest {

    /**
     * Unit test <code>PortScan</code> with defaults.
     */
    @Test
    public void testPortScan() {
        log.info("testPortScan");
        final PortScan portScan = new PortScan();
        assertNotNull(portScan);
        log.info(portScan.toString());
    }

    /**
     * Unit test <code>PortScan</code> with IP and portNo.
     */
    @Test
    public void testPortScanIpPort() {
        log.info("testPortScanIpPort");
        final PortScan portScan = new PortScan("127.0.0.1", 8080);
        assertNotNull(portScan);
        log.info(portScan.toString());
    }

    /**
     * Unit test <code>PortScan</code> with null IP.
     */
    @Test(expected = AssertionError.class)
    public void testPortScanNull() {
        log.info("testPortScanNull");
        final PortScan portScan = new PortScan(null, 8080);
        assertNotNull(portScan);
    }

    /**
     * Unit test <code>PortScan</code> with String[] arguments.
     */
    @Test
    public void testPortScanArgs() {
        log.info("testPortScanArgs");
        final String[] args = { "127.0.0.1", "8080" };
        final PortScan portScan = new PortScan(args);
        assertNotNull(portScan);
        log.info(portScan.toString());
    }

    /**
     * Unit test <code>PortScan</code> with null String[] arguments.
     */
    @Test(expected = AssertionError.class)
    public void testPortScanNullArgs() {
        log.info("testPortScanNullArgs");
        final String[] args = {};
        final PortScan portScan = new PortScan(args);
        assertNotNull(portScan);
    }

    /**
     * Unit test <code>PortScan</code> with empty String[] arguments.
     */
    @Test(expected = AssertionError.class)
    public void testPortScanEmptyArgs() {
        log.info("testPortScanEmptyArgs");
        final String[] args = {};
        final PortScan portScan = new PortScan(args);
        assertNotNull(portScan);
    }

    /**
     * Unit test <code>PortScan</code> with zero String[] arguments.
     */
    @Test(expected = AssertionError.class)
    public void testPortScanZeroArgs() {
        log.info("testPortScanZeroArgs");
        final String[] args = new String[0];
        final PortScan portScan = new PortScan(args);
        assertNotNull(portScan);
    }

}
