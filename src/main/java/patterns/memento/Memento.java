
package patterns.memento;

/**
 * The Memento Class.
 */
class Memento {

	/** The state. */
	private final Object state;

	/**
	 * Instantiates a new memento.
	 *
	 * @param state the state
	 */
	public Memento(Object state) {
		super();
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
