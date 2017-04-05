
package patterns.ajp.system.router;

/**
 * The OutputChannel Interface.
 */
public interface OutputChannel {

	/**
	 * Send message.
	 *
	 * @param message the message
	 */
	public void sendMessage(Message message);

}