package patterns.ajp.system.session;

/**
 * The Session Class.
 */
class Session {

	private long id;

	public Session() {
	}

	public Session(long id) {
		super();
		this.id = id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

}
