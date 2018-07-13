
package coaching.idioms;

import java.util.Calendar;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Unit test for the DateHelper class.
 */
public final class DateHelperTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(DateHelperTest.class);

    /**
     * Unit Test to now.
     */
    @Test
    public void testNow() {
        LOG.info("testNow");
        final Calendar now = DateHelper.now();
        assertNotNull(now);
        LOG.debug("testNow = {}", now.toString());
    }

    /**
     * Unit Test to yesterday.
     */
    @Test
    public void testYesterday() {
        LOG.info("testYesterday");
        final Calendar yesterday = DateHelper.yesterday();
        assertNotNull(yesterday);
        LOG.debug("yesterday.toString() = {}", yesterday.toString());
        final Calendar now = Calendar.getInstance();
        now.add(Calendar.DAY_OF_YEAR, -1);
    }

    /**
     * Unit Test to tomorrow.
     */
    @Test
    public void testTomorrow() {
        LOG.info("testTomorrow");
        final Calendar tomorrow = DateHelper.tomorrow();
        assertNotNull(tomorrow);
        LOG.debug("tomorrow.toString() = {}", tomorrow.toString());
        final Calendar now = Calendar.getInstance();
        now.add(Calendar.DAY_OF_YEAR, +1);
    }

}
