
package coaching.pool;

import lombok.extern.slf4j.Slf4j;

/**
 * ResourceBorrowException Class.
 */
@SuppressWarnings("serial")
@Slf4j
public class ResourceBorrowException extends ResourcePoolException {

    /**
     * Instantiates a new resource borrow exception.
     *
     * exception message
     *
     * @param exceptionMessage the exception message
     */
    public ResourceBorrowException(final String exceptionMessage) {
        super(exceptionMessage);
    }

    /**
     * Instantiates a new resource borrow exception.
     *
     * exception
     *
     * @param exception the exception
     */
    public ResourceBorrowException(final Exception exception) {
        super(exception);
    }

}
