
package patterns.chain;

/**
 * Handler Interface.
 */
public interface HandlerInterface {

    /**
     * Handle request.
     *
     * @param request
     *            the request
     */
    HandlerInterface handleRequest(final RequestInterface request);

}
