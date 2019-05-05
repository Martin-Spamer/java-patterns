
package patterns.state;

/**
 * Context Class.
 */
public class Context {

    /** state. */
    private AbstractState state = null;

    /**
     * Instantiates a new context.
     *
     * @param state the state
     */
    public Context(final AbstractState state) {
        super();
        this.state = state;
    }

    /**
     * To alice.
     *
     * @return the context
     */
    public Context toAlice() {
        this.state = new StateAlice();
        return this;
    }

    /**
     * To bob.
     *
     * @return the context
     */
    public Context toBob() {
        this.state = new StateBob();
        return this;
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
