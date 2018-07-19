
package coaching.idioms;

import static org.junit.Assert.fail;

/**
 * Example Utility class, contains only static methods. It is a final class
 * and uses a private constructor to prevent wild instantiation.
 */
public final class UtilityClass {

    /**
     * Instantiates a new utility class.
     */
    private UtilityClass() {
        fail("The UtilityClass methods should be accessed statically");
    }

    /**
     * Operation.
     *
     * @return true, if successful
     */
    public static boolean operation() {
        return true;
    }

}
