
package coaching.net;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Unit test for the PicoDaemon class.
 */
public final class PicoDaemonTest {

    /** Provides logging. */
    private static final Logger LOG = LoggerFactory
        .getLogger(PicoDaemonTest.class);

    /**
     * Unit test to pico daemon.
     */
    @Test
    public void testPicoDaemon() {
        final PicoDaemon picoDaemon = new PicoDaemon();
        assertNotNull(picoDaemon);
        LOG.info(picoDaemon.toString());
        final Thread thread = new Thread(picoDaemon);
        thread.start();
        // open socket localhost:8888
        thread.interrupt();
        LOG.info(picoDaemon.toString());
    }

}
