package coaching.idioms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
		this.timeOut = timeout;
		return this;
	}

	public long timeOut() {
		return this.timeOut;
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
		return this.interval;
	}

	/**
	 * Until.
	 */
	public boolean until(final Condition condition) {
		if (condition != null) {
			final long startTime = System.currentTimeMillis();
			final long endTime = startTime + this.timeOut;
			do {
				if (condition.result()) {
					this.log.info("pass at {}", System.currentTimeMillis());
					return true;
				} else {
					try {
						this.log.info("sleep {} at {}", this.interval, System.currentTimeMillis());
						Thread.sleep(this.interval);
					} catch (final InterruptedException ex) {
						Thread.currentThread().interrupt();
					}
				}
			} while (System.currentTimeMillis() < endTime);
			this.log.info("timeout at {}", System.currentTimeMillis());
		} else {
			this.log.info("null condition at {}", System.currentTimeMillis());
		}
		return false;
	}

}
