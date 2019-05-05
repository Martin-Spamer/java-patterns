
package coaching.pool;

import lombok.extern.slf4j.Slf4j;

/**
 * ResourceInitialisationException Class.
 */
@SuppressWarnings("serial")


@Slf4j
public class ResourceInitialisationException extends ResourcePoolException {

    /**
     * Instantiates a new resource initialisation exception.
     *
     * exception message
     *
     * @param exceptionMessage the exception message
     */
    public ResourceInitialisationException(final String exceptionMessage) {
        super(exceptionMessage);
    }
}
