
package patterns.chain;

/**
 * HandlerInterface Interface.
 */
public interface HandlerInterface {

	/**
	 * Handle request.
	 *
	 * request
	 * handler interface
	 *
	 * @param request the request
	 */
	abstract void handleRequest(RequestInterface request);

}