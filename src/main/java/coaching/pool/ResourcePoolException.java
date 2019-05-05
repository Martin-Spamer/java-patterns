
package coaching.pool;

import lombok.extern.slf4j.Slf4j;

/**
 * ResourcePoolException Class.
 */
@SuppressWarnings("serial")


@Slf4j
public class ResourcePoolException extends Exception {

    /**
     * Instantiates a new resource pool exception.
     *
     * @param message the message
     */
    public ResourcePoolException(final String message) {
        super(message);
    }

    /**
     * Instantiates a new resource pool exception.
     *
     * @param exception the exception
     */
    public ResourcePoolException(final Exception exception) {
        super(exception);
    }

}
