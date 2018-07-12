
package coaching.net;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * The Class PicoProxyTest.
 */
public class PicoProxyTest {

    /** The Constant LOG. */
    private static final Logger LOG = LoggerFactory.getLogger(PicoProxyTest.class);

    /**
     * Unit test to pico proxy.
     */
    @Test
    public void testPicoProxy() {
        PicoProxy picoProxy = new PicoProxy();
        assertNotNull(picoProxy);
        LOG.info(picoProxy.toString());
    }

}
