
package coaching.range;

import java.util.Date;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DateRangeTest {

    /** provides logging */
    private static final Logger log = LoggerFactory.getLogger(DateRangeTest.class);

    @Test
    public void testDateRange() {
        log.info("DateRange : {}", new DateRange(new Date(), new Date()));
    }

}
