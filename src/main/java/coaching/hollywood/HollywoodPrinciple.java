
package coaching.hollywood;

/**
 * A class showing the HollywoodPrinciple.
 */
public class HollywoodPrinciple {

    /**
     * Don't call us.
     * Getting a value and sending it to something else,
     * has two points of coupling.
     *
     */
    public void dontCallUs() {
        try {
            throw new RuntimeException("Don't call us.");
        } catch (final RuntimeException e) {
            // increased coupling, two points of contact, two reasons to change.
            final String msg = e.toString();
            System.err.println(msg);
        }
    }

    /**
     * Well call you.
     */
    public void wellCallYou() {
        try {
            throw new RuntimeException("We'll call you.");
        } catch (final RuntimeException e) {
            // decreased coupling, one point of contact, one reason to change.
            e.printStackTrace(System.err);
        }
    }
}
