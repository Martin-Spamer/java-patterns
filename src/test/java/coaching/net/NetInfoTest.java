
package coaching.net;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

public class NetInfoTest {

    private static final Logger LOG = LoggerFactory.getLogger(NetInfoTest.class);

    @Test
    public void testNetInfo() {
        NetInfo netInfo = new NetInfo();
        assertNotNull(netInfo);
        LOG.info(netInfo.toString());
    }

}
