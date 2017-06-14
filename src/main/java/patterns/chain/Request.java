
package patterns.chain;

/**
 * Request Class.
 */
public class Request extends AbstractRequest implements RequestInterface {

	/**
	 * Instantiates a new request.
	 *
	 * payload
	 *
	 * @param payload the payload
	 */
	public Request(String payload) {
		setPayload(payload);
	}

}
