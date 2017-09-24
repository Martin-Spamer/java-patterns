

package patterns.memento;

/**
 * Caretaker Class.
 */
class Caretaker {

	private Memento memento;

	/**
	 * memento.
	 *
	 * @return the memento
	 */
	public Memento getMemento() {
		return memento;
	}

	/**
	 * memento.
	 *
	 * @param memento the new
	 *            memento
	 */
	public void setMemento(final Memento memento) {
		this.memento = memento;
	}

}
