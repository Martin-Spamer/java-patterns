
package patterns.memento;

/**
 * Originator Class.
 */
public class Originator {

	/** The state. */
	private Object state;

	/** The memento. */
	private Memento memento;

	/**
	 * Instantiates a new originator.
	 *
	 * state
	 * memento
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
	 * memento.
	 *
	 * memento
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
	 * memento.
	 *
	 * new memento
	 *
	 * @param memento the new
	 * 			memento
	 */
	public void setMemento(final Memento memento) {
		this.memento = memento;
	}

	/**
	 * memento.
	 *
	 * memento
	 *
	 * @return the memento
	 */
	public Memento getMemento() {
		return memento;
	}

}
