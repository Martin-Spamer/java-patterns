
package patterns.memento;

/**
 * Originator Class.
 */
public class Originator {

    /** The memento. */
    private Memento memento;

    /**
     * Instantiates a new originator.
     */
    public Originator() {
        this.memento = createMemento();
    }

    /**
     * The Constructor.
     *
     * @param state the state
     */
    public Originator(final Object state) {
        this.memento = createMemento(state);
    }

    /**
     * memento.
     *
     * @return the memento
     */
    public Memento createMemento() {
        this.memento = new Memento();
        return this.memento;
    }

    /**
     * memento factory method.
     *
     * @param state the state
     * @return the memento
     */
    public Memento createMemento(final Object state) {
        this.memento = new Memento(state);
        return this.memento;
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
        return this.memento;
    }

}
