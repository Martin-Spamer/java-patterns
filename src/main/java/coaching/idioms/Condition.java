
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
	private Condition(final boolean result) {
		this.result = result;
	}

	public static Condition isTrue() {
		return new Condition(true);
	}

	public static Condition isFalse() {
		return new Condition(false);
	}

}
