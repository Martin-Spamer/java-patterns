
package coaching.application;

import java.util.Properties;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Unit test class for Scheduler.
 */
public class SchedulerTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory
        .getLogger(SchedulerTest.class);

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

    /**
     * Unit test to scheduler string array.
     */
    @Test
    public void testSchedulerStringArray() {
        final String[] args = { "key=value" };
        final Scheduler scheduler = new Scheduler(args);
        assertNotNull(scheduler);
        LOG.info("{}", scheduler);
        scheduler.execute();
    }

    /**
     * Unit test to scheduler null string array.
     */
    @Test
    public void testSchedulerNullStringArray() {
        final String[] args = null;
        final Scheduler scheduler = new Scheduler(args);
        assertNotNull(scheduler);
        LOG.info("{}", scheduler);
    }

    /**
     * Unit test to scheduler properties.
     */
    @Test
    public void testSchedulerProperties() {
        final Properties properties = new Properties();
        properties.setProperty("key", "value");
        final Scheduler scheduler = new Scheduler(properties);
        assertNotNull(scheduler);
        LOG.info("{}", scheduler);
        scheduler.execute();
    }

    /**
     * Unit test to scheduler null properties.
     */
    @Test
    public void testSchedulerNullProperties() {
        final Properties properties = null;
        final Scheduler scheduler = new Scheduler(properties);
        assertNotNull(scheduler);
        LOG.info("{}", scheduler);
    }

}
