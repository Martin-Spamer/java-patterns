
package patterns.router;

/**
 * Input Channel Interface.
 */
public interface InputChannelInterface {

	/**
	 * Receive message.
	 *
	 * @param message the message
	 */
	public Message receiveMessage();

}
