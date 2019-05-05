
package coaching.range;

import java.util.Date;

import org.junit.Test;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class DateRangeTest {

    /**
     *  provides logging.
     */

    @Test
    public void testDateRange() {
        log.info("DateRange : {}", new DateRange(new Date(), new Date()));
    }

}
