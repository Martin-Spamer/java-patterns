
package patterns.memento;

import java.util.UUID;

/**
 * Originator Class.
 */
public class Originator {

    /** The state. */
    private UUID state = UUID.randomUUID();

    /**
     * Creates the memento.
     *
     * @return the memento
     */
    public Memento createMemento() {
        return new Memento(this.state);
    }

    /**
     * Change.
     */
    public void change() {
        this.state = UUID.randomUUID();
    }

    /**
     * Restore.
     *
     * @param memento the memento
     */
    public void restore(final Memento memento) {
        this.state = (UUID) memento.getState();
    }

    /**
     * Verify.
     *
     * @param state the state
     * @return true, if successful
     */
    public boolean verify(final Memento state) {
        return state.getState() == this.state;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("Originator [state=%s]", this.state);
    }

}
