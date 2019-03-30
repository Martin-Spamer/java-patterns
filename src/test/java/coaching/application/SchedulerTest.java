
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
     * Unit test to scheduler string array.
     */
    @Test
    public void testSchedulerStringArray() {
        String[] strArray = new String[10];
        final ExampleScheduler scheduler = new ExampleScheduler(strArray);
        assertNotNull(scheduler);
        assertNotNull(scheduler.execute());
        LOG.debug("testSchedulerStringArray : {}", scheduler);
    }

    /**
     * Unit test to scheduler string array.
     */
    @Test
    public void testSchedulerNullStringArray() {
        String[] nullArray = null;
        final ExampleScheduler scheduler = new ExampleScheduler(nullArray);
        assertNotNull(scheduler);
        assertNotNull(scheduler.execute());
        LOG.debug("testSchedulerNullStringArray : {}", scheduler);
    }

}
