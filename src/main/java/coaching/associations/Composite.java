
package coaching.associations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Show Java implement a UML Composite association.
 *
 * In a Composite the Lifetime of parts is same as the lifetime of the parts.
 * We call this a life-time constraint.
 **/
public final class Composite {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(Composite.class);

    /**
     * The Composite implemented using separate members.
     */
    private Alice alice = new Alice();
    private Bob bob = new Bob();
    private Charlie charlie = new Charlie();
    private Dan dan = new Dan();

    /**
     * Instantiates a new composite class array.
     */
    public Composite() {
        super();
        alice = new Alice();
        bob = new Bob();
        charlie = new Charlie();
        dan = new Dan();
    }

    /**
     * Instantiates a new composite.
     *
     * @param elementAlice
     *            the element alice
     * @param elementBob
     *            the element bob
     * @param elementCharlie
     *            the element charlie
     * @param elementDan
     *            the element dan
     */
    public Composite(final Alice elementAlice,
            final Bob elementBob,
            final Charlie elementCharlie,
            final Dan elementDan) {
        super();
        alice = elementAlice;
        bob = elementBob;
        charlie = elementCharlie;
        dan = elementDan;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String
            .format("%s [alice=%s, bob=%s, charlie=%s, dan=%s]",
                    this.getClass().getSimpleName(),
                    alice,
                    bob,
                    charlie,
                    dan);
    }

}
