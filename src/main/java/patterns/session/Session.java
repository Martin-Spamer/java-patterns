
package patterns.session;

/**
 * Session Class.
 */
class Session {

	private long id = 0L;

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
	public Session(final long id) {
		super();
		this.id = id;
	}

	/**
	 * id.
	 *
	 * @param id the new id
	 */
	public void setId(final long id) {
		this.id = id;
	}

	/**
	 * id.
	 *
	 * @return the id
	 */
	public long getId() {
		return this.id;
	}

}
