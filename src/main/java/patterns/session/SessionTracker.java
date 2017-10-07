

package patterns.session;

import java.util.ArrayList;

/**
 * SessionTracker Class.
 */
public class SessionTracker {

	private final ArrayList<Session> sessions = new ArrayList<Session>();

	/**
	 * create a new Session.
	 *
	 * @return the session
	 */
	public AbstractSession createSession() {
		final Session session = new Session();
		sessions.add(session);
		return session;
	}

	/**
	 * Destroy session.
	 *
	 * @param session the session
	 */
	public void destroySession(final AbstractSession session) {
		sessions.remove(session);
	}

}
