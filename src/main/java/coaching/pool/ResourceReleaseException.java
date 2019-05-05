
package coaching.pool;

import lombok.extern.slf4j.Slf4j;

/**
 * ResourceReleaseException Class.
 */
@SuppressWarnings("serial")


@Slf4j
public class ResourceReleaseException extends ResourcePoolException {

    /**
     * Instantiates a new resource release exception.
     *
     * @param exceptionMessage the exception message
     */
    public ResourceReleaseException(final String exceptionMessage) {
        super(exceptionMessage);
    }

}
