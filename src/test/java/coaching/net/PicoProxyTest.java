
package coaching.net;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

public class PicoProxyTest {

    private static final Logger LOG = LoggerFactory.getLogger(PicoProxyTest.class);

    @Test
    public void testPicoProxy() {
        PicoProxy picoProxy = new PicoProxy();
        assertNotNull(picoProxy);
        LOG.info(picoProxy.toString());
    }

}
