
package patterns.ajp.behavioral.mediator;

/**
 * The Interface ClientInterface.
 */
public interface ClientInterface {

	/**
	 * Handle event.
	 */
	public void handleEvent();

	/**
	 * Broadcast event.
	 */
	public void broadcastEvent();
}