
package coaching.utility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.extern.slf4j.Slf4j;

/**
 * The Class Error.
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
