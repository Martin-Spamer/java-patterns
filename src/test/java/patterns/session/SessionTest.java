
package patterns.session;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SessionTest {

    @Test
    public void type() {
        assertThat(Session.class, notNullValue());
    }

    @Test
    public void instantiation() {
        final Session target = new Session();
        assertThat(target, notNullValue());
    }

}
