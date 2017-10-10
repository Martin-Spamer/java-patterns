


package patterns.command;

/**
 * MissingCommandException Class.
 */
@SuppressWarnings("serial")
public class MissingCommandException extends Exception {

	/**
	 * Instantiates a new missing command exception.
	 *
	 * message
	 *
	 * @param message the message
	 */
	public MissingCommandException(final String message) {
		super(message);
	}

}
