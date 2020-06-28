
package patterns.chain;

import lombok.extern.slf4j.Slf4j;

/**
 * HandlerTwo Class.
 */





@Slf4j
public class HandlerTwo extends AbstractHandler {

    /**
     * Instantiates a new handler two.
     */
    public HandlerTwo() {
        super();
    }

    /**
     * Instantiates a new handler two.
     *
     * @param next the next
     */
    public HandlerTwo(final HandlerInterface next) {
        super(next);
    }

    /*
     * (non-Javadoc)
     * @see patterns.chain.Handler#handleRequest()
     */
    @Override
    public AbstractHandler handleRequest(final RequestInterface request) {
        doSomething(request);
        return super.handleRequest(request);
    }

    /**
     * Do something.
     *
     * @param request the request
     */
    private void doSomething(final RequestInterface request) {
        log.info("doSomething {}", request);
    }

}
