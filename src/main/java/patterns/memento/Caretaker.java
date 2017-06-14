
package patterns.memento;

/**
 * Caretaker Class.
 */
class Caretaker {

	/** The memento. */
	public Memento memento;

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

	/**
	 * memento.
	 *
	 * new memento
	 *
	 * @param memento the new
	 * 			memento
	 */
	public void setMemento(Memento memento) {
		this.memento = memento;
	}

}