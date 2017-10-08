


package patterns.session;

import java.util.UUID;

/**
 * Abstract Session class.
 */
public class AbstractSession {

	protected UUID randomUUID = null;
	protected long id = 0L;
	protected String value;

	/**
	 * Instantiates a new abstract session.
	 */
	public AbstractSession() {
		super();
		randomUUID = UUID.randomUUID();
	}

	/**
	 * Instantiates a new abstract session.
	 *
	 * @param id the id
	 */
	public AbstractSession(final long id) {
		super();
		randomUUID = UUID.randomUUID();
		setId(id);
	}

	/**
	 * set the id.
	 *
	 * @param id the new id
	 * @return the abstract session
	 */
	public AbstractSession setId(final long id) {
		this.id = id;
		return this;
	}

	/**
	 * get the id.
	 *
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("AbstractSession [randomUUID=%s, id=%s, value=%s]", randomUUID, id, value);
	}

}
