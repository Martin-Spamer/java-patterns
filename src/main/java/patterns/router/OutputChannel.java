
package patterns.router;

/**
 * OutputChannel Interface.
 */
public interface OutputChannel {

	/**
	 * Send message.
	 *
	 * message
	 *
	 * @param message the message
	 */
	public void sendMessage(Message message);

}
