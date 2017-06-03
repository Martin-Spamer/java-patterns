/**
 *  @title       ResourcePoolInitialisationException.java
 *  @description TODO
 *	Created      01-Nov-2004
 *
 **/

package idioms.pool;

/**
 * The ResourceCreationException Class.
 */
@SuppressWarnings("serial")
public class ResourceCreationException extends ResourcePoolException {

	/**
	 * Instantiates a new resource creation exception.
	 *
	 * @param exceptionMessage the exception message
	 */
	public ResourceCreationException(final String exceptionMessage) {
		super(exceptionMessage);
	}

}
