
package coaching.net;

import java.util.Properties;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

import coaching.application.AbstractScheduler;
import coaching.application.Scheduler;

public class SchedulerTest {

    private static final Logger LOG = LoggerFactory.getLogger(SchedulerTest.class);

    @Test
    public void testScheduler() {
        AbstractScheduler scheduler = new Scheduler();
        assertNotNull(scheduler);
        LOG.info(scheduler.toString());
    }

    @Test
    public void testSchedulerProperties() {
        Properties properties = new Properties();
        AbstractScheduler scheduler = new Scheduler(properties);
        assertNotNull(scheduler);
        LOG.info(scheduler.toString());
    }

    @Test
    public void testSchedulerNullProperties() {
        Properties properties = null;
        AbstractScheduler scheduler = new Scheduler(properties);
        assertNotNull(scheduler);
        LOG.info(scheduler.toString());
    }

    @Test
    public void testSchedulerStringArray() {
        String[] args = { "", "" };
        AbstractScheduler scheduler = new Scheduler(args);
        assertNotNull(scheduler);
        LOG.info(scheduler.toString());
    }

    @Test
    public void testSchedulerZeroStringArray() {
        AbstractScheduler scheduler = new Scheduler(new String[0]);
        assertNotNull(scheduler);
        LOG.info(scheduler.toString());
    }

    @Test
    public void testSchedulerNullStringArray() {
        String[] args = null;
        AbstractScheduler scheduler = new Scheduler(args);
        assertNotNull(scheduler);
        LOG.info(scheduler.toString());
    }
}
