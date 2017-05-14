package patterns.chain;

/**
 * Request Class.
 */
public class Request extends AbstractRequest implements RequestInterface {

	public Request(String payload) {
		setPayload(payload);
	}

}
