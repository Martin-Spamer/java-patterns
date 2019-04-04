
package patterns.memento;

import lombok.extern.slf4j.Slf4j;

/**
 * Originator Class.
 */
@Slf4j
public class Originator {

    /** The memento. */
    private Memento memento;

    /**
     * Instantiates a new originator.
     */
    public Originator() {
        memento = createMemento();
    }

    /**
     * The Constructor.
     *
     * @param state the state
     */
    public Originator(final Object state) {
        memento = createMemento(state);
    }

    /**
     * memento.
     *
     * @return the memento
     */
    public Memento createMemento() {
        memento = new Memento();
        return memento;
    }

    /**
     * memento factory method.
     *
     * @param state the state
     * @return the memento
     */
    public Memento createMemento(final Object state) {
        memento = new Memento(state);
        return memento;
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
