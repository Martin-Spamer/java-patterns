
package coaching.thread;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

public class DaemonThreadTest {

    /** provides logging */
    private static final Logger LOG = LoggerFactory.getLogger(DaemonThreadTest.class);

    @Test
    public void testRunDaemonThread() {
        DaemonThread daemon = DaemonThread.getSingleton();
        assertNotNull(daemon);
        LOG.info("{}", daemon);
        daemon.start();
        LOG.info("{}", daemon);
        daemon.interrupt();
        LOG.info("{}", daemon);
    }

}
