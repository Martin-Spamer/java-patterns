
package patterns.interpreter;

/**
 * Context Class.
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
	 * state
	 *
	 * @param state the state
	 */
	public Context(final String state) {
		super();
		setState(state);
	}

	/**
	 * state.
	 *
	 * new state
	 *
	 * @param state the new
	 * 			state
	 */
	public void setState(Object state) {
		this.state = state;
	}

	/**
	 * state.
	 *
	 * state
	 *
	 * @return the state
	 */
	public Object getState() {
		return state;
	}

}
