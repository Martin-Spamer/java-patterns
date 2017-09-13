package patterns.session;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class SessionTrackerTest {

	@Test
	public void testSessionTracker() {
		assertNotNull(new SessionTracker());
	}

}
