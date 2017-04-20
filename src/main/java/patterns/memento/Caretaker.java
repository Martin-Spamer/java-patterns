
package patterns.memento;

/**
 * The Caretaker Class.
 */
class Caretaker {

	/** The memento. */
	public Memento memento;

	/**
	 * Gets the memento.
	 *
	 * @return the memento
	 */
	public Memento getMemento() {
		return memento;
	}

	/**
	 * Sets the memento.
	 *
	 * @param memento the new memento
	 */
	public void setMemento(Memento memento) {
		this.memento = memento;
	}

}