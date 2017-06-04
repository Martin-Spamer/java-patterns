/**
 *  @title       ResourcePoolInitialisationException.java
 *  @description TODO
 *	Created      01-Nov-2004
 **/

package javamentor.pool;

/**
 * The ResourcePoolCreationException Class.
 */
@SuppressWarnings("serial")
public class ResourcePoolCreationException extends ResourcePoolException {

	/**
	 * Instantiates a new resource pool creation exception.
	 *
	 * @param exceptionMessage the exception message
	 */
	public ResourcePoolCreationException(final String exceptionMessage) {
		super(exceptionMessage);
	}

	public ResourcePoolCreationException(final Exception exception) {
		super(exception);
	}

}
