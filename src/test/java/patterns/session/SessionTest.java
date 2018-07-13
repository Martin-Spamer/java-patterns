
package patterns.session;

import static org.hamcrest.CoreMatchers.notNullValue;

import org.junit.Test;

import static org.junit.Assert.assertThat;

/**
 * The Class SessionTest.
 */
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
