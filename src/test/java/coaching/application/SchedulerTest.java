
package coaching.application;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit test class for Scheduler.
 */


/** The Constant 			log. */
@Slf4j
public class SchedulerTest {

    /**
     * Unit test to scheduler string array.
     */
    @Test
    public void testSchedulerStringArray() {
        String[] strArray = new String[10];
        final ExampleScheduler scheduler = new ExampleScheduler(strArray);
        assertNotNull(scheduler);
        assertNotNull(scheduler.execute());
        log.debug("testSchedulerStringArray : {}", scheduler);
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
        log.debug("testSchedulerNullStringArray : {}", scheduler);
    }

}
