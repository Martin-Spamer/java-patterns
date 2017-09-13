
package coaching.idioms;

/**
 * A FluentWait Class.
 */
public class FluentWait {

	private long timeOut;
	private long interval;
	private Condition condition;

	/**
	 * Time out.
	 *
	 * @param timeout the timeout
	 */
	public void timeOut(final long timeout) {
		this.timeOut = timeout;
	}

	/**
	 * Interval.
	 *
	 * @param interval the interval
	 */
	public void interval(final long interval) {
		this.interval = interval;
	}

	/**
	 * Until.
	 *
	 */
	public void until(final Condition condition) {
		this.condition = condition;
	}

}
