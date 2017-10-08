


package patterns.memento;

/**
 * Memento Class.
 */
public class Memento {

	private Object state;

	/**
	 * Instantiates a new memento.
	 */
	public Memento() {
		super();
	}

	/**
	 * Instantiates a new memento.
	 *
	 * @param state the state
	 */
	public Memento(final Object state) {
		super();
		this.state = state;
	}

	/**
	 * state.
	 *
	 * new state
	 *
	 * @param state the new
	 *            state
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
		return state;
	}

}
