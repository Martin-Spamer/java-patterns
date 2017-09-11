
package coaching.idioms;

/**
 * Condition Class.
 */
public class Condition implements ConditionInterface<Boolean> {
	private boolean result = false;

	/**
	 * Instantiates a new condition.
	 */
	public Condition() {
	}

	/**
	 * Instantiates a new condition.
	 *
	 * @param result the result
	 */
	public Condition(final boolean result) {
		this.result = result;
	}

	/**
	 * Checks if is true.
	 *
	 * @return true, if is
	 * 			true
	 */
	public boolean isTrue() {
		return result == true;
	}

	/**
	 * Checks if is false.
	 *
	 * @return true, if is
	 * 			false
	 */
	public boolean isFalse() {
		return result == false;
	}

}
