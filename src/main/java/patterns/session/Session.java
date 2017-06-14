
package patterns.session;

/**
 * Session Class.
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
	 * id
	 *
	 * @param id the id
	 */
	public Session(long id) {
		super();
		this.id = id;
	}

	/**
	 * id.
	 *
	 * new id
	 *
	 * @param id the new
	 * 			id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * id.
	 *
	 * id
	 *
	 * @return the id
	 */
	public long getId() {
		return id;
	}

}
