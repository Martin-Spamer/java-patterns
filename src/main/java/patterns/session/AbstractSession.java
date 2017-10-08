
package patterns.session;

import java.util.UUID;

/**
 * Abstract Session class.
 */
public abstract class AbstractSession {

	protected UUID uuid = UUID.randomUUID();
	protected String token;

	/**
	 * Instantiates a new abstract session.
	 */
	public AbstractSession() {
		super();
	}

	/**
	 * Sets the uuid.
	 *
	 * @param uuid the uuid to set
	 */
	public void setUuid(final UUID uuid) {
		this.uuid = uuid;
	}

	/**
	 * Sets the token.
	 *
	 * @param token the token to set
	 */
	public void setToken(final String token) {
		this.token = token;
	}

	/**
	 * Gets the uuid.
	 *
	 * @return the uuid
	 */
	public UUID getUuid() {
		return this.uuid;
	}

	/**
	 * Gets the token.
	 *
	 * @return the token
	 */
	public String getToken() {
		return this.token;
	}

	/**
	 * Timestamp.
	 *
	 * @return the long
	 * @see java.util.UUID#timestamp()
	 */
	public long timestamp() {
		return this.uuid.timestamp();
	}

	/**
	 * Node.
	 *
	 * @return the long
	 * @see java.util.UUID#node()
	 */
	public long node() {
		return this.uuid.node();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("AbstractSession [randomUUID=%s, value=%s]", this.uuid, this.token);
	}
}
