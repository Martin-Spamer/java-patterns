/**
 *  @title       ResourcePoolInitialisationException.java
 *  @description TODO
 *	Created      01-Nov-2004
 *
 **/

package coaching.pool;

/**
 * ResourceInitialisationException Class.
 */
@SuppressWarnings("serial")
public class ResourceInitialisationException extends ResourcePoolException {

	/**
	 * Instantiates a new resource initialisation exception.
	 *
	 * exception message
	 *
	 * @param exceptionMessage
	 *            the exception message
	 */
	public ResourceInitialisationException(final String exceptionMessage) {
		super(exceptionMessage);
	}
}
