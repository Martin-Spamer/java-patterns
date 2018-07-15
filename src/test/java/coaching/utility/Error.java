
package coaching.utility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Error {

    private static final Logger LOG = LoggerFactory.getLogger(Error.class);

    public static void fail(final String message) {
        LOG.error(message);
        throw new AssertionError(message);
        // or your preferred exceptions
    }
}
