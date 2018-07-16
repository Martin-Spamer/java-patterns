
package coaching.hollywood;

/**
 * A class showing the HollywoodPrinciple.
 */
public class HollywoodPrinciple {

    /**
     * Don't call us.
     */
    public void dontCallUs() {
        try {
            throw new Exception("Don't call us.");
        } catch (final Exception e) {
            // increased coupling, two points of contact, two reasons to change.
            final String msg = e.getLocalizedMessage();
            System.err.println(msg);
        }
    }

    /**
     * Well call you.
     */
    public void wellCallYou() {
        try {
            throw new Exception("We'll call you.");
        } catch (final Exception e) {
            // decreased coupling, one point of contact, one reason to change.
            e.printStackTrace(System.err);
        }
    }
}
