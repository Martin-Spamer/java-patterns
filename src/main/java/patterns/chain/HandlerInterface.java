

package patterns.chain;

/**
 * HandlerInterface Interface.
 */
public interface HandlerInterface {

	/**
	 * Handle request.
	 *
	 * @param request the request
	 */
	abstract void handleRequest(RequestInterface request);

}