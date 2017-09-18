
package patterns.router;

/**
 * Input Channel Interface.
 */
public interface InputChannelInterface {

	/**
	 * Receive message.
	 *
	 * @return the message
	 */
	public Message receiveMessage();

}
