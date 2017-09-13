
package patterns.router;

/**
 * InputChannel Interface.
 */
public interface InputChannel {

	/**
	 * Receive message.
	 *
	 * @param message the message
	 */
	public Message receiveMessage();

}
