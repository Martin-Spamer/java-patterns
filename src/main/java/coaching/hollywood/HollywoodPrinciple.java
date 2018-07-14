
package coaching.hollywood;

/**
 * The Class HollywoodPrinciple.
 */
public class HollywoodPrinciple {

    /**
     * Dont call us.
     */
    public void dontCallUs() {
        try {
            throw new Exception();
        } catch (final Exception e) {
            // increased coupling, two points of contact, two reasons to change.
            final String msg = e.getLocalizedMessage();
            System.out.println(msg);
        }
    }

    /**
     * Well call you.
     */
    public void wellCallYou() {
        try {
            throw new Exception();
        } catch (final Exception e) {
            // decreased coupling, one point of contact, one reason to change.
            e.printStackTrace(System.out);
        }
    }
}
