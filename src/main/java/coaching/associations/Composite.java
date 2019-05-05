
package coaching.associations;

/**
 * Show Java implement a UML Composite association.
 *
 * In a Composite the Lifetime of parts is same as the lifetime of the parts. We
 * call this a life-time constraint.
 **/
public final class Composite {

    /**
     * The Composite implemented using separate members.
     */
    private AbstractPerson alice = new Alice();

    /** The bob. */
    private AbstractPerson bob = new Bob();

    /** The charlie. */
    private AbstractPerson charlie = new Charlie();

    /** The dan. */
    private AbstractPerson dan = new Dan();

    /**
     * Instantiates a new composite class array.
     */
    public Composite() {
        super();
        this.alice = new Alice();
        this.bob = new Bob();
        this.charlie = new Charlie();
        this.dan = new Dan();
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [alice=%s, bob=%s, charlie=%s, dan=%s]",
            this.getClass().getSimpleName(),
            this.alice,
            this.bob,
            this.charlie,
            this.dan);
    }

}
