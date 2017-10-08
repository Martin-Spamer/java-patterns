


package patterns.chain;

/**
 * Request Class.
 */
public class Request extends AbstractRequest implements RequestInterface {

	/**
	 * Instantiates a new request.
	 *
	 * @param payload the payload
	 */
	public Request(final String payload) {
		setPayload(payload);
	}

}
