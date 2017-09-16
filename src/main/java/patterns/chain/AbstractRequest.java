
package patterns.chain;

/**
 * AbstractRequest Class.
 */
public class AbstractRequest {

	private String payload;

	/**
	 * payload.
	 *
	 * @return the payload
	 */
	public String getPayload() {
		return this.payload;
	}

	/**
	 * payload.
	 *
	 * new payload
	 *
	 * @param payload the new
	 * 			payload
	 */
	public void setPayload(final String payload) {
		this.payload = payload;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("%s [payload=%s]", this.getClass().getSimpleName(), this.payload);
	}

}
