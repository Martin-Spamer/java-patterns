
package coaching.idioms;

import static org.junit.Assert.fail;

/**
 * Example Utility class, contains only static methods. It is a final class
 * and uses a private constructor to prevent wild instantiation.
 */
public final class UtilityClass {

    private UtilityClass() {
        fail("The UtilityClass methods should be accessed statically");
    }

    public static boolean operation() {
        return true;
    }

}
