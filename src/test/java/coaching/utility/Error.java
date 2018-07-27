
package coaching.utility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class Error.
 */
public class Error {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(Error.class);

    /**
     * Fail.
     *
     * @param message the message
     */
    public static void fail(final String message) {
        LOG.error(message);
        throw new AssertionError(message);
        // or your preferred exceptions
    }
}
