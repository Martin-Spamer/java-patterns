
package coaching.net;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * The Class PicoDaemonTest.
 */
public class PicoDaemonTest {

    /** Provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(PicoDaemonTest.class);

    /**
     * Unit test to pico daemon.
     */
    @Test
    public void testPicoDaemon() {
        PicoDaemon picoDaemon = new PicoDaemon();
        assertNotNull(picoDaemon);
        LOG.info(picoDaemon.toString());
    }

}
