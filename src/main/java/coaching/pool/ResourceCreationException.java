
package coaching.pool;

import lombok.extern.slf4j.Slf4j;

/**
 * ResourceCreationException Class.
 */
@SuppressWarnings("serial")


@Slf4j
public class ResourceCreationException extends ResourcePoolException {

    /**
     * Instantiates a new resource creation exception.
     *
     * exception message
     *
     * @param exceptionMessage the exception message
     */
    public ResourceCreationException(final String exceptionMessage) {
        super(exceptionMessage);
    }

}
