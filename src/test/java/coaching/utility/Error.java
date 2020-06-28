
package coaching.utility;

import lombok.extern.slf4j.Slf4j;

/**
 * The Error.
 */



@Slf4j
public class Error {

    /**
     * Fail.
     *
     * @param message the message
     */
    public static void fail(final String message) {
        log.error(message);
        throw new AssertionError(message);
        // or your preferred exceptions
    }
}
