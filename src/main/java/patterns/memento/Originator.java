

package patterns.memento;

/**
 * Originator Class.
 */
public class Originator {

	private Object state;

	private Memento memento;

	/**
	 * Instantiates a new originator.
	 *
	 * @param state the state
	 * @param memento the memento
	 */
	public Originator(final Object state, final Memento memento) {
		super();
		this.state = state;
		this.memento = memento;
	}

	/**
	 * memento.
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
	 * @param memento the new memento
	 */
	public void setMemento(final Memento memento) {
		this.memento = memento;
	}

	/**
	 * memento.
	 *
	 * @return the memento
	 */
	public Memento getMemento() {
		return memento;
	}

}
