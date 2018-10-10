
package coaching.application;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Unit test class for Scheduler.
 */
public class SchedulerTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(SchedulerTest.class);

    /**
     * Unit test to scheduler.
     */
    @Test
    public void testScheduler() {
        final Scheduler scheduler = new Scheduler();
        assertNotNull(scheduler);
        LOG.info("{}", scheduler);
        scheduler.execute();
    }

}
