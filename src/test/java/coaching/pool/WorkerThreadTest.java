
package coaching.pool;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit test class for WorkerThread.
 */


@Slf4j
public class WorkerThreadTest {

    /**
     * Unit test to worker thread.
     */
    @Test
    public void testWorkerThread() {
        assertNotNull(new WorkerThread("commandName"));
    }

    /**
     * Unit test to run.
     */
    @Test
    public void testRun() {
        new WorkerThread("commandName").run();
    }

}
