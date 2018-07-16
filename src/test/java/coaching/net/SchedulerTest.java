
package coaching.net;

import java.util.Properties;

import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

import coaching.application.AbstractScheduler;
import coaching.application.Scheduler;

/**
 * Unit tests for the Scheduler class.
 */
@Ignore("work-in-progress")
public final class SchedulerTest {

    /** Provides logging. */
    private static final Logger LOG = LoggerFactory
        .getLogger(SchedulerTest.class);

    /**
     * Unit test the Scheduler class default constructor.
     */
    @Test
    public void testScheduler() {
        AbstractScheduler scheduler = new Scheduler();
        assertNotNull(scheduler);
        scheduler.execute();
        LOG.info(scheduler.toString());
    }

    /**
     * Unit test to scheduler properties.
     */
    @Test
    public void testSchedulerProperties() {
        Properties properties = new Properties();
        AbstractScheduler scheduler = new Scheduler(properties);
        assertNotNull(scheduler);
        scheduler.execute();
        LOG.info(scheduler.toString());
    }

    /**
     * Unit test to scheduler null properties.
     */
    @Test
    public void testSchedulerNullProperties() {
        Properties properties = null;
        AbstractScheduler scheduler = new Scheduler(properties);
        assertNotNull(scheduler);
        scheduler.execute();
        LOG.info(scheduler.toString());
    }

    /**
     * Unit test to scheduler string array.
     */
    @Test
    public void testSchedulerStringArray() {
        String[] args = { "", "" };
        AbstractScheduler scheduler = new Scheduler(args);
        assertNotNull(scheduler);
        scheduler.execute();
        LOG.info(scheduler.toString());
    }

    /**
     * Unit test to scheduler zero string array.
     */
    @Test
    public void testSchedulerZeroStringArray() {
        AbstractScheduler scheduler = new Scheduler(new String[0]);
        assertNotNull(scheduler);
        scheduler.execute();
        LOG.info(scheduler.toString());
    }

    /**
     * Unit test to scheduler null string array.
     */
    @Test
    public void testSchedulerNullStringArray() {
        String[] args = null;
        AbstractScheduler scheduler = new Scheduler(args);
        assertNotNull(scheduler);
        scheduler.execute();
        LOG.info(scheduler.toString());
    }
}
