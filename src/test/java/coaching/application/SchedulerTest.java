
package coaching.application;

import java.util.Properties;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

import coaching.resources.ResourceNotLoadedException;

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
        final ExampleScheduler scheduler = new ExampleScheduler();
        assertNotNull(scheduler);
        assertNotNull(scheduler.execute());
        LOG.debug("testScheduler : {}", scheduler);
    }

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

    /**
     * Unit test to scheduler resource name.
     */
    @Test
    public void testSchedulerResourceName() {
        String resourceName = "ExampleScheduler";
        final ExampleScheduler scheduler = new ExampleScheduler(resourceName);
        assertNotNull(scheduler);
        assertNotNull(scheduler.execute());
        LOG.debug("testSchedulerResourceName : {}", scheduler);
    }

    /**
     * Unit test to scheduler resource name.
     */
    @Test
    public void testSchedulerResourceNameExt() {
        String resourceName = "ExampleScheduler.xml";
        final ExampleScheduler scheduler = new ExampleScheduler(resourceName);
        assertNotNull(scheduler);
        assertNotNull(scheduler.execute());
        LOG.debug("testSchedulerResourceName : {}", scheduler);
    }

    /**
     * Unit test to scheduler resource name.
     */
    @Test
    public void testSchedulerMissingResource() {
        String resourceName = "Missing.xml";
        final ExampleScheduler scheduler = new ExampleScheduler(resourceName);
        assertNotNull(scheduler);
        assertNotNull(scheduler.execute());
        LOG.debug("testSchedulerResourceName : {}", scheduler);
    }

    /**
     * Unit test to scheduler null resource name.
     */
    @Test(expected = ResourceNotLoadedException.class)
    public void testSchedulerNullResourceName() {
        String nullStr = null;
        final ExampleScheduler scheduler = new ExampleScheduler(nullStr);
        assertNotNull(scheduler);
        assertNotNull(scheduler.execute());
        LOG.debug("testSchedulerNullResourceName : {}", scheduler);
    }

    /**
     * Unit test to scheduler properties.
     */
    @Test
    public void testSchedulerProperties() {
        final ExampleScheduler scheduler = new ExampleScheduler(new Properties());
        assertNotNull(scheduler);
        assertNotNull(scheduler.execute());
        LOG.debug("testSchedulerProperties : {}", scheduler);
    }

    /**
     * Unit test to scheduler properties.
     */
    @Test
    public void testSchedulerNullProperties() {
        Properties properties = null;
        final ExampleScheduler scheduler = new ExampleScheduler(properties);
        assertNotNull(scheduler);
        assertNotNull(scheduler.execute());
        LOG.debug("testSchedulerNullProperties : {}", scheduler);
    }

    /**
     * Unit test to scheduler properties.
     */
    @Test
    public void testSchedulerExecuteProperties() {
        final ExampleScheduler scheduler = new ExampleScheduler();
        assertNotNull(scheduler);
        assertNotNull(scheduler.execute(new Properties()));
        LOG.debug("testSchedulerProperties : {}", scheduler);
    }

}
