
package patterns.state;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import lombok.extern.slf4j.Slf4j;

/**
 * Context class tests.
 */


@Slf4j
public final class ContextTest {

    /**
     * Unit test to typical usage.
     */
    @Test
    public void testTypicalUsage() {
        final AbstractState state = null;
        final Context target = new Context(state);
        assertThat(target, notNullValue());
    }

    /**
     * Type.
     */
    @Test
    public void type() {
        assertThat(Context.class, notNullValue());
    }

    /**
     * Instantiation.
     */
    @Test
    public void instantiation() {
        final AbstractState state = null;
        final Context target = new Context(state);
        assertThat(target, notNullValue());
    }

    /**
     * Unit test to to alice.
     */
    @Test
    public void testToAlice() {
        // Given
        final AbstractState state = null;
        final Context context = new Context(state);

        // When
        assertEquals(context.toAlice(), context);

        // Then
        final String expected = "Context [state=StateAlice]";
        assertThat(context.toString(), is(equalTo(expected)));
    }

    /**
     * Unit test to to bob.
     */
    @Test
    public void testToBob() {
        // Given
        final AbstractState state = null;
        final Context context = new Context(state);

        // When
        assertEquals(context.toBob(), context);

        // Then
        final String expected = "Context [state=StateBob]";
        assertThat(context.toString(), is(equalTo(expected)));
    }

    /**
     * To string a$.
     */
    @Test
    public void toString_A$() {
        // Given
        final AbstractState state = null;
        final Context target = new Context(state);

        // When
        final String actual = target.toString();

        // Then
        final String expected = "Context [state=null]";
        assertThat(actual, is(equalTo(expected)));
    }

}
