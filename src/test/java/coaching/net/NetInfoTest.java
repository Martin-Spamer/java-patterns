
package coaching.net;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit tests for the NetInfo class.
 */
@Slf4j
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
        log.info(netInfo.toString());
    }

}
