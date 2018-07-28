
package coaching.net;

import java.util.Properties;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

import coaching.application.AbstractScheduler;
import coaching.application.Scheduler;

/**
 * Unit tests for the Scheduler class.
 */
public final class SchedulerTest {

    /** Provides logging. */
    private static final Logger LOG = LoggerFactory
        .getLogger(SchedulerTest.class);

    /**
     * Unit test the Scheduler class default constructor.
     */
    @Test
    public void testScheduler() {
        final AbstractScheduler scheduler = new Scheduler();
        assertNotNull(scheduler);
        scheduler.execute();
        LOG.info("{}", scheduler);
    }

    /**
     * Unit test to scheduler properties.
     */
    @Test
    public void testSchedulerProperties() {
        final Properties properties = new Properties();
        final AbstractScheduler scheduler = new Scheduler(properties);
        assertNotNull(scheduler);
        scheduler.execute(properties);
        LOG.info("{}", scheduler);
    }

    /**
     * Unit test to scheduler null properties.
     */
    @Test
    public void testSchedulerNullProperties() {
        final Properties properties = null;
        final AbstractScheduler scheduler = new Scheduler(properties);
        assertNotNull(scheduler);
        scheduler.execute(properties);
        LOG.info("{}", scheduler);
    }

    /**
     * Unit test to scheduler string array.
     */
    @Test
    public void testSchedulerStringArray() {
        final String[] args = { "", "" };
        final AbstractScheduler scheduler = new Scheduler(args);
        assertNotNull(scheduler);
        scheduler.execute();
        LOG.info("{}", scheduler);
    }

    /**
     * Unit test to scheduler zero string array.
     */
    @Test
    public void testSchedulerZeroStringArray() {
        final AbstractScheduler scheduler = new Scheduler(new String[0]);
        assertNotNull(scheduler);
        scheduler.execute();
        LOG.info("{}", scheduler);
    }

    /**
     * Unit test to scheduler null string array.
     */
    @Test
    public void testSchedulerNullStringArray() {
        final String[] args = null;
        final AbstractScheduler scheduler = new Scheduler(args);
        assertNotNull(scheduler);
        scheduler.execute();
        LOG.info("{}", scheduler);
    }

}
