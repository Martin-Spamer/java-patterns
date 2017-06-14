
package patterns.router;

/**
 * InputChannel Interface.
 */
public interface InputChannel {

	/**
	 * Receive message.
	 *
	 * message
	 *
	 * @param message the message
	 */
	public void receiveMessage(Message message);

}
