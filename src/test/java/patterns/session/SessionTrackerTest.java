
package patterns.session;

import static org.hamcrest.CoreMatchers.notNullValue;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import static org.junit.Assume.assumeNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * SessionTracker class tests.
 */



@Slf4j
public final class SessionTrackerTest {

    /**
     * Unit test to typical usage.
     */
    @Test
    public void testTypicalUsage() {
        log.info("testTypicalUsage");

        // Given
        final SessionTracker sessionTracker = new SessionTracker();
        assumeNotNull(sessionTracker);
        log.info(sessionTracker.toString());

        // When
        final AbstractSession session = sessionTracker.createSession();
        session.setToken("TestToken");
        assertNotNull(session);
        log.info(session.toString());

        // Then
        assertEquals("TestToken", session.token());
        sessionTracker.destroySession(session);
        log.info(sessionTracker.toString());
    }

    /**
     * Type.
     */
    @Test
    public void type() {
        assertThat(SessionTracker.class, notNullValue());
    }

    /**
     * Instantiation.
     */
    @Test
    public void instantiation() {
        final SessionTracker target = new SessionTracker();
        assertThat(target, notNullValue());
    }

}
