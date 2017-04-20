
package patterns.memento;

/**
 * The Originator Class.
 */
public class Originator {

	/** The state. */
	private Object state;

	/** The memento. */
	private Memento memento;

	/**
	 * Instantiates a new originator.
	 *
	 * @param state the state
	 * @param memento the memento
	 */
	public Originator(Object state, Memento memento) {
		super();
		this.state = state;
		this.memento = memento;
	}

	/**
	 * Creates the memento.
	 *
	 * @return the memento
	 */
	public Memento createMemento() {
		memento = new Memento(state);
		return memento;
	}

	/**
	 * Revert.
	 */
	public void revert() {
		state = getMemento();
	}

	/**
	 * Sets the memento.
	 *
	 * @param memento the new memento
	 */
	public void setMemento(final Memento memento) {
		this.memento = memento;
	}

	/**
	 * Gets the memento.
	 *
	 * @return the memento
	 */
	public Memento getMemento() {
		return memento;
	}

}
