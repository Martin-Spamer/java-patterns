


package coaching.idioms;

/**
 * Condition Class.
 */
public class Condition implements ConditionInterface<Boolean> {

	private boolean result = false;

	/**
	 * Instantiates a new condition.
	 *
	 * @param result the result
	 */
	protected Condition(final boolean result) {
		this.result = result;
	}

	/**
	 * Checks if is true.
	 *
	 * @return the condition
	 */
	public static Condition isTrue() {
		return new Condition(true);
	}

	/**
	 * Checks if is false.
	 *
	 * @return the condition
	 */
	public static Condition isFalse() {
		return new Condition(false);
	}

	/**
	 * Result.
	 *
	 * @return true, if successful
	 */
	public boolean result() {
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Condition [result=%s]", result);
	}

}
