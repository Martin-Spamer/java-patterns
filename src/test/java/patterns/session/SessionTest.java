
package patterns.session;

import static org.hamcrest.CoreMatchers.notNullValue;

import org.junit.Test;

import static org.junit.Assert.assertThat;

import lombok.extern.slf4j.Slf4j;

/**
 * The Class SessionTest.
 */
@Slf4j
public final class SessionTest {

    /**
     * Type.
     */
    @Test
    public void type() {
        assertThat(Session.class, notNullValue());
    }

    /**
     * Instantiation.
     */
    @Test
    public void instantiation() {
        final Session target = new Session();
        assertThat(target, notNullValue());
    }

}
