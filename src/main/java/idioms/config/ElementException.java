/**
 *  @title       HandlerException
 *  @description TODO [description].
 **/

package idioms.config;

/**
 * The ElementException Class.
 */
@SuppressWarnings("serial")
public class ElementException extends Exception {
	// Attributes

	/** The Constant UNKNOWN_ERROR. */

	public static final int UNKNOWN_ERROR = 0;

	/** The error number. */
	long errorNumber = ElementException.UNKNOWN_ERROR;

	/**
	 * Instantiates a new element exception.
	 */
	public ElementException() {
		super();
	}

	/**
	 * Instantiates a new element exception.
	 *
	 * @param exceptionMessage the exception message
	 */
	public ElementException(final String exceptionMessage) {
		super(exceptionMessage);
	}

} // end of class HandlerException
