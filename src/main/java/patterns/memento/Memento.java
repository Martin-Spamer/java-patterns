
package patterns.memento;

/**
 * Memento class, See GOF Design Patterns.
 */
public class Memento {

    /** The state to be encapsulated. */
    private Object state;

    /**
     * Instantiates a new memento.
     */
    public Memento() {
        super();
    }

    /**
     * Instantiates a new memento.
     *
     * @param state the state
     */
    public Memento(final Object state) {
        super();
        this.state = state;
    }

    /**
     * state.
     *
     * state
     *
     * @return the state
     */
    public Object getState() {
        return this.state;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [state=%s]", this.getClass().getSimpleName(), this.state);
    }

}
