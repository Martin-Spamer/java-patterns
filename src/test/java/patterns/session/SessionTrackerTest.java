package patterns.session;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * Session Tracker Test class.
 */
public class SessionTrackerTest {

	/**
	 * Unit Test to session tracker.
	 */
	@Test
	public void testSessionTracker() {
		final SessionTracker sessionTracker = new SessionTracker();
		assertNotNull(sessionTracker);
	}

}
