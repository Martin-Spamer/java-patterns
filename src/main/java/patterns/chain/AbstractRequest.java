package patterns.chain;

/**
 * The AbstractRequest Class.
 */
public class AbstractRequest {

	private String payload;

	/**
	 * Instantiates a new abstract request.
	 */
	public AbstractRequest() {
		super();
	}

	/**
	 * Gets the payload.
	 *
	 * @return the payload
	 */
	public String getPayload() {
		return payload;
	}

	/**
	 * Sets the payload.
	 *
	 * @param payload the new payload
	 */
	public void setPayload(String payload) {
		this.payload = payload;
	}

	@Override
	public String toString() {
		return String.format("%s [payload=%s]", this.getClass().getSimpleName(), payload);
	}

}
