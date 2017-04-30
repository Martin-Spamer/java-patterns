
package patterns.session;

/**
 * The Session Class.
 */
class Session {

	private long id;

	/**
	 * Instantiates a new session.
	 */
	public Session() {
	}

	/**
	 * Instantiates a new session.
	 *
	 * @param id the id
	 */
	public Session(long id) {
		super();
		this.id = id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public long getId() {
		return id;
	}

}
