/**
 *  @title       ResourcePoolInitialisationException.java
 *  @description TODO
 *	Created      01-Nov-2004
 *
 **/

package javamentor.pool;

/**
 * The ResourceBorrowException Class.
 */
@SuppressWarnings("serial")
public class ResourceBorrowException extends ResourcePoolException {

	/**
	 * Instantiates a new resource borrow exception.
	 *
	 * @param exceptionMessage the exception message
	 */
	public ResourceBorrowException(final String exceptionMessage) {
		super(exceptionMessage);
	}

	public ResourceBorrowException(final Exception exception) {
		super(exception);
	}

}
