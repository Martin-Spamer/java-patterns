/**
 *  @title       ResourcePoolInitialisationException.java
 *  @description TODO
 *	Created      01-Nov-2004
 *
 **/

package coaching.pool;

/**
 * ResourceReleaseException Class.
 */
@SuppressWarnings("serial")
public class ResourceReleaseException extends ResourcePoolException {

	/**
	 * Instantiates a new resource release exception.
	 *
	 * exception message
	 *
	 * @param exceptionMessage the exception message
	 */
	public ResourceReleaseException(final String exceptionMessage) {
		super(exceptionMessage);
	}

}
