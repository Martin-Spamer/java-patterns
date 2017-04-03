
package patterns.ajp.system.router;

/**
 * The Interface OutputChannel.
 */
public interface OutputChannel {

	/**
	 * Send message.
	 *
	 * @param message the message
	 */
	public void sendMessage(Message message);

}