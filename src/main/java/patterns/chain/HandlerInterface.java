
package patterns.chain;

/**
 * Handler Interface.
 */
public interface HandlerInterface {

	/**
	 * Handle request.
	 *
	 * @param request the request
	 */
	public void handleRequest(final RequestInterface request);

}