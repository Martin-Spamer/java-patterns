
package coaching.idioms;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;

import lombok.extern.slf4j.Slf4j;

/**
 * TimeStampTest.
 */
@Slf4j
public class TimeStampTest {

    /**
     * Unit test case for the TimeStamp class.
     */
    @Test
    public final void testTimeStampNow() {
        final String testTimeStamp = TimeStamp.now();
        assertNotNull("Value cannot be null", testTimeStamp);
        log.debug("TimeStamp = {}");
    }

    /**
     * Unit test case for the TimeStamp class.
     */
    @Test
    public final void testTimeStamp() {
        final TimeStamp testTimeStamp1 = new TimeStamp();
        assertNotNull("Value cannot be null", testTimeStamp1);
        log.debug("TimeStamp = {}", testTimeStamp1);

        final TimeStamp testTimeStamp2 = new TimeStamp();
        assertNotNull("Value cannot be null", testTimeStamp2);
        log.debug("TimeStamp = {}", testTimeStamp2);

        assertNotSame("Not same", testTimeStamp1, testTimeStamp2);

        log.trace("{}", testTimeStamp1);
        log.trace("{}", testTimeStamp1.time);
        log.trace("{}", testTimeStamp1.toString());
        log.trace("{}", testTimeStamp2);
        log.trace("{}", testTimeStamp2.time);
        log.trace(testTimeStamp2.toString());
        log.trace(TimeStamp.TIMESTAMP_FORMAT);
    }

}
