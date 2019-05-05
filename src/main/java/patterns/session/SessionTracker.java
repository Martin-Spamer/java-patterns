
package patterns.session;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

/**
 * SessionTracker Class.
 */




@Slf4j
public class SessionTracker {

    /** The sessions. */
    private final List<Session> sessions = new ArrayList<>();

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

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [sessions=%s]", this.getClass().getSimpleName(), sessions);
    }

}
