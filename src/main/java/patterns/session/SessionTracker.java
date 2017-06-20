package patterns.session;

import java.util.ArrayList;

/**
 * SessionTracker Class.
 */
public class SessionTracker {

	private ArrayList<Session> sessions = new ArrayList<Session>();

	/**
	 * Instantiates a new session tracker.
	 */
	public SessionTracker() {
		super();
	}

	/**
	 * create a new Session.
	 */
	public Session createSession() {
		final Session session = new Session();
		this.sessions.add(session);
		return session;
	}

	/**
	 * Destroy session.
	 */
	public void destroySession(final Session session) {
		this.sessions.remove(session);
	}

}
