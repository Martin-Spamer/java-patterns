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
	public void setState(final Object state) {
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
		return this.state;
	}

	@Override
	public boolean contains(final Data data) {
		return false;
	}

}
