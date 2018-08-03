
package patterns.chain;

/**
 * Handler Interface.
 */
public interface HandlerInterface {

    /**
     * Handle request.
     *
     * @param request the request
     * @return the handler interface
     */
    HandlerInterface handleRequest(final RequestInterface request);

}
