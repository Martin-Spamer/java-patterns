
package coaching.net;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Unit tests for the NetInfo class.
 */
public final class NetInfoTest {

    /** Provides logging. */
    private static final Logger LOG = LoggerFactory
            .getLogger(NetInfoTest.class);

    /**
     * Unit test to net info.
     * @throws Exception
     */
    @Test
    public void testNetInfo() throws Exception {
        final NetInfo netInfo = new NetInfo();
        assertNotNull(netInfo);
        LOG.info(netInfo.toString());
    }

}
