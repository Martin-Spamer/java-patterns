
package coaching.net;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Unit tests for the NetInfo class.
 */
public final class NetInfoTest {

    /**
     * Unit test to net info.
     *
     * @throws Exception the exception
     */
    @Test
    public void testNetInfo() throws Exception {
        final NetInfo netInfo = new NetInfo();
        assertNotNull(netInfo);
    }

}
