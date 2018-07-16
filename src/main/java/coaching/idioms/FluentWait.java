
package coaching.idioms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A Fluent Wait Class, will test a condition for one second.
 */
public class FluentWait {

    /** provides logging. */
    protected final Logger log = LoggerFactory
        .getLogger(this.getClass().getSimpleName());

    /** The DEFAULT_INTERVAL is Constant 100 milliseconds. */
    private static final int DEFAULT_INTERVAL = 100;

    /** The DEFAULT_TIMEOUT is Constant 1000 milliseconds (1 second). */
    private static final int DEFAULT_TIMEOUT = 1000;

    /** The actual time out. */
    private long timeOut = DEFAULT_TIMEOUT;

    /** The actual interval. */
    private long interval = DEFAULT_INTERVAL;

    /**
     * Set the time out.
     *
     * @param timeout
     *            the timeout
     * @return the fluent wait
     */
    public FluentWait setTimeOut(final long timeout) {
        timeOut = timeout;
        return this;
    }

    /**
     * Time out.
     *
     * @return the timeOut as long
     */
    public long setTimeOut() {
        return timeOut;
    }

    /**
     * set the interval.
     *
     * @param interval
     *            the interval
     * @return the fluent wait
     */
    public FluentWait setInterval(final long interval) {
        this.interval = interval;
        return this;
    }

    /**
     * Interval.
     *
     * @return the interval as native long.
     */
    public long getInterval() {
        return interval;
    }

    /**
     * Until.
     *
     * @param condition
     *            the condition
     * @return true, if successful, otherwise false., otherwise false.
     */
    public boolean until(final Condition condition) {
        if (condition != null) {
            final long startTime = System.currentTimeMillis();
            final long endTime = startTime + timeOut;
            do {
                if (condition.isTrue()) {
                    log.debug("pass at {}", System.currentTimeMillis());
                    return true;
                } else {
                    try {
                        log
                            .debug("sleep {} at {}",
                                    interval,
                                    System.currentTimeMillis());
                        Thread.sleep(interval);
                    } catch (final InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                }
            } while (System.currentTimeMillis() < endTime);
            log.info("timeout at {}", System.currentTimeMillis());
        } else {
            log.error("null condition at {}", System.currentTimeMillis());
        }
        return false;
    }

}
