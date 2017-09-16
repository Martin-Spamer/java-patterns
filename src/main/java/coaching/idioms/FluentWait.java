package coaching.idioms;

import org.slf4j.*;

/**
 * A Fluent Wait Class, will test a condition for one second.
 */
public class FluentWait {
	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	private long timeOut = 1000;
	private long interval = 100;

	/**
	 * Set the time out.
	 *
	 * @param timeout the timeout
	 * @return
	 */
	public FluentWait timeOut(final long timeout) {
		timeOut = timeout;
		return this;
	}

	public long timeOut() {
		return timeOut;
	}

	/**
	 * set the interval.
	 *
	 * @param interval the interval
	 */
	public FluentWait interval(final long interval) {
		this.interval = interval;
		return this;
	}

	public long interval() {
		return interval;
	}

	/**
	 * Until.
	 */
	public boolean until(final Condition condition) {
		if (condition != null) {
			final long startTime = System.currentTimeMillis();
			final long endTime = startTime + timeOut;
			do {
				if (condition.result()) {
					log.info("pass at {}", System.currentTimeMillis());
					return true;
				} else {
					try {
						log.info("sleep {} at {}", interval, System.currentTimeMillis());
						Thread.sleep(interval);
					} catch (final InterruptedException ex) {
						Thread.currentThread().interrupt();
					}
				}
			} while (System.currentTimeMillis() < endTime);
			log.info("timeout at {}", System.currentTimeMillis());
		} else {
			log.info("null condition at {}", System.currentTimeMillis());
		}
		return false;
	}

}
