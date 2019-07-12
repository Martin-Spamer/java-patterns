
package patterns.chain;

import lombok.extern.slf4j.Slf4j;

/**
 * HandlerOne Class.
 */





@Slf4j
public class HandlerOne extends AbstractHandler {

    /**
     * Instantiates a new handler one.
     */
    public HandlerOne() {
        super();
    }

    /**
     * Instantiates a new handler one.
     *
     * @param next the next
     */
    public HandlerOne(final HandlerInterface next) {
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
        log.info("doSomething {}", this);
    }

}
