
package patterns.session;

import java.util.ArrayList;

/**
 * SessionTracker Class.
 */
public class SessionTracker {

	private final ArrayList<Session> sessions = new ArrayList<Session>();

	/**
	 * Instantiates a new session tracker.
	 */
	public SessionTracker() {
		super();
	}

	/**
	 * create a new Session.
	 *
	 * @return the session
	 */
	public Session createSession() {
		final Session session = new Session();
		sessions.add(session);
		return session;
	}

	/**
	 * Destroy session.
	 *
	 * @param session the session
	 */
	public void destroySession(final Session session) {
		sessions.remove(session);
	}

}
