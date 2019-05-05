
package patterns.memento;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * A UnitTest for Originator objects.
 */
public final class OriginatorTest {

    /**
     * test Originator object.
     */
    @Test
    public void testTypicalUsage() {
        // Given
        final Originator originator = new Originator();
        Memento state = originator.createMemento();

        // When
        originator.change();
        originator.restore(state);

        // Then
        assertTrue(originator.verify(state));
    }

}
