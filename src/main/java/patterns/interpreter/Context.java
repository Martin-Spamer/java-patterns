
package patterns.interpreter;

/**
 * The Context Class.
 */
public class Context implements ContextInterface {

	private Object state;

	/**
	 * Instantiates a new context.
	 */
	public Context() {
		super();
		setState(new String(""));
	}

	/**
	 * Instantiates a new context.
	 *
	 * @param state the state
	 */
	public Context(final String state) {
		super();
		setState(state);
	}

	/**
	 * Sets the state.
	 *
	 * @param state the new state
	 */
	public void setState(Object state) {
		this.state = state;
	}

	/**
	 * Gets the state.
	 *
	 * @return the state
	 */
	public Object getState() {
		return state;
	}

}
