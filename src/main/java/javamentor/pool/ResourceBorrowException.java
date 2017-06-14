/**
 *  @title       ResourcePoolInitialisationException.java
 *  @description TODO
 *	Created      01-Nov-2004
 *
 **/

package javamentor.pool;

/**
 * ResourceBorrowException Class.
 */
@SuppressWarnings("serial")
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
