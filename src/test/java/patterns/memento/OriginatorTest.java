
package patterns.memento;

import static org.hamcrest.CoreMatchers.notNullValue;

import java.util.UUID;

import org.junit.Test;

import static org.junit.Assert.assertThat;

/**
 * The Class OriginatorTest.
 */
public final class OriginatorTest {

    /**
     * Unit test to typical usage.
     */
    @Test
    public void testTypicalUsage() {
        // Given
        final String stateOne = UUID.randomUUID().toString();
        final String stateTwo = UUID.randomUUID().toString();

        // When
        final Originator originator = new Originator(stateOne);
        originator.createMemento(stateTwo);
        originator.revert();

        // Then
    }

    /**
     * Type.
     */
    @Test
    public void type() {
        assertThat(Originator.class, notNullValue());
    }

    /**
     * Instantiation.
     */
    @Test
    public void instantiation() {
        final Object state = null;
        final Memento memento = null;
        final Originator target = new Originator(state, memento);
        assertThat(target, notNullValue());
    }

    /**
     * Creates the memento a$.
     */
    @Test
    public void createMemento_A$() {
        // Given
        final Object state = null;
        final Memento memento = null;
        final Originator originator = new Originator(state, memento);

        // When
        final Memento actual = originator.createMemento();

        // Then
    }

    /**
     * Revert a$.
     */
    @Test
    public void revert_A$() {
        // Given
        final Object state = UUID.randomUUID().toString();
        final Memento memento = new Memento(state);
        final Originator originator = new Originator(state, memento);

        // When
        originator.createMemento();

        // Then
        originator.revert();

    }

}
