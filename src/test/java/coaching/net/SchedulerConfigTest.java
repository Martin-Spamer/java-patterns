
package coaching.net;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Unit tests for the SchedulerConfig class.
 */
public final class SchedulerConfigTest {

    /** LOG 			constant. */
    private static final Logger LOG = LoggerFactory
        .getLogger(SchedulerConfigTest.class);

    /**
     * Unit test to scheduler config.
     */
    @Test
    public void testSchedulerConfig() {
        final SchedulerConfig config = new SchedulerConfig();
        assertNotNull(config);
        LOG.info("{}", config);
    }

    /**
     * Unit test to scheduler config.
     */
    @Test
    public void testSchedulerConfigString() {
        final SchedulerConfig config = new SchedulerConfig(
                "Scheduler.properties");
        assertNotNull(config);
        LOG.info("{}", config);
    }

}
