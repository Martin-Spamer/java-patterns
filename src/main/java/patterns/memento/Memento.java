
package patterns.memento;

/**
 * The Memento Class.
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
	public Memento(Object state) {
		super();
		this.state = state;
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
