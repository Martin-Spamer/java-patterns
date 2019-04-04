
package coaching.idioms;

import java.util.Calendar;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit test for the DateHelper class.
 */
@Slf4j
public final class DateHelperTest {

    /**
     * Unit Test to now.
     */
    @Test
    public void testNow() {
        log.info("testNow");
        final Calendar now = DateHelper.now();
        assertNotNull(now);
        log.debug("testNow = {}", now.toString());
    }

    /**
     * Unit Test to yesterday.
     */
    @Test
    public void testYesterday() {
        log.info("testYesterday");
        final Calendar yesterday = DateHelper.yesterday();
        assertNotNull(yesterday);
        log.debug("yesterday.toString() = {}", yesterday.toString());
        final Calendar now = Calendar.getInstance();
        now.add(Calendar.DAY_OF_YEAR, -1);
    }

    /**
     * Unit Test to tomorrow.
     */
    @Test
    public void testTomorrow() {
        log.info("testTomorrow");
        final Calendar tomorrow = DateHelper.tomorrow();
        assertNotNull(tomorrow);
        log.debug("tomorrow.toString() = {}", tomorrow.toString());
        final Calendar now = Calendar.getInstance();
        now.add(Calendar.DAY_OF_YEAR, +1);
    }

}
