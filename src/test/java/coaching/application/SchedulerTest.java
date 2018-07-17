
package coaching.application;

import java.util.Properties;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

public class SchedulerTest {

    private static final Logger LOG = LoggerFactory
        .getLogger(SchedulerTest.class);

    @Test
    public void testScheduler() {
        final Scheduler scheduler = new Scheduler();
        assertNotNull(scheduler);
        LOG.info("{}", scheduler);
        scheduler.execute();
    }

    @Test
    public void testSchedulerStringArray() {
        final String[] args = { "key=value" };
        final Scheduler scheduler = new Scheduler(args);
        assertNotNull(scheduler);
        LOG.info("{}", scheduler);
        scheduler.execute();
    }

    @Test
    public void testSchedulerNullStringArray() {
        final String[] args = null;
        final Scheduler scheduler = new Scheduler(args);
        assertNotNull(scheduler);
        LOG.info("{}", scheduler);
    }

    @Test
    public void testSchedulerProperties() {
        final Properties properties = new Properties();
        properties.setProperty("key", "value");
        final Scheduler scheduler = new Scheduler(properties);
        assertNotNull(scheduler);
        LOG.info("{}", scheduler);
        scheduler.execute();
    }

    @Test
    public void testSchedulerNullProperties() {
        final Properties properties = null;
        final Scheduler scheduler = new Scheduler(properties);
        assertNotNull(scheduler);
        LOG.info("{}", scheduler);
    }

}
