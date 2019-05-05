
package patterns.chain;

import lombok.extern.slf4j.Slf4j;

/**
 * Request Class.
 */




@Slf4j
public final class Request extends AbstractRequest {

    /**
     * Instantiates a new request.
     *
     * @param payload the payload
     */
    public Request(final String payload) {
        super();
        setPayload(payload);
    }

}
