
package coaching.thread;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit test class for DaemonThread.
 */
@Slf4j
public class DaemonThreadTest {

    /**
     * Unit test to run daemon thread.
     */
    @Test
    public void testRunDaemonThread() {
        DaemonThread daemon = DaemonThread.getSingleton();
        assertNotNull(daemon);
        log.info("{}", daemon);
        daemon.start();
        log.info("{}", daemon);
        daemon.interrupt();
        log.info("{}", daemon);
    }

}
