
package coaching.net;

/**
 * ApplicationException Class.
 */
@SuppressWarnings("serial")
public class ApplicationException extends Exception {

    /**
     * Instantiates a new application exception.
     *
     * message
     *
     * @param message the message
     */
    public ApplicationException(final String message) {
        super(message);
    }

    /**
     * The Constructor.
     *
     * @param exception the exception
     */
    public ApplicationException(final Exception exception) {
        super(exception);
    }

}
