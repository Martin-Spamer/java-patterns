
package patterns.session;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;

import java.util.UUID;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import static org.junit.Assume.assumeNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * AbstractSession class tests.
 */


/** The Constant 			log. */
@Slf4j
public final class AbstractSessionTest {

    /**
     * Test Mock for AbstractSession.
     */
    public final class TestMockSession extends AbstractSession {
    }

    /**
     * Unit test to typical usage.
     */
    @Test
    public void testTypicalUsage() {
        // Given
        final TestMockSession testSession = new TestMockSession();
        assumeNotNull(testSession);

        // When
        testSession.setToken("token");
        assertThat(testSession, notNullValue());

        // Then
        final String token = testSession.token();
        assertThat(token, is(equalTo("token")));
    }

    /**
     * Type.
     */
    @Test
    public void type() {
        assertThat(TestMockSession.class, notNullValue());
    }

    /**
     * Sets the token as string.
     */
    @Test
    public void testSetGetToken() {
        // Given
        final TestMockSession testSession = new TestMockSession();
        assumeNotNull(testSession);

        // When
        final String token = "token";
        testSession.setToken(token);

        // Then
        assertThat(token, is(equalTo("token")));
    }

    /**
     * Gets the uuid.
     */
    @Test
    public void testSetGetUuid() {
        // Given
        final TestMockSession testSession = new TestMockSession();
        assumeNotNull(testSession);

        // When
        final UUID actual = testSession.getUuid();

        // Then
        assertNotNull(actual);
    }

    /**
     * Unit test ToString.
     */
    @Test
    public void testToString() {
        // Given
        final TestMockSession testSession = new TestMockSession();
        assumeNotNull(testSession);

        // When
        final String actual = testSession.toString();

        // Then
        assertNotNull(actual);
        log.debug("toString = {}", actual);
    }

}
