
package patterns.memento;

import java.util.UUID;

/**
 * Originator Class.
 */
public class Originator {

    private UUID state = UUID.randomUUID();

    public Memento createMemento() {
        return new Memento(this.state);
    }

    public void change() {
        this.state = UUID.randomUUID();
    }

    public void restore(final Memento memento) {
        this.state = (UUID) memento.getState();
    }

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
