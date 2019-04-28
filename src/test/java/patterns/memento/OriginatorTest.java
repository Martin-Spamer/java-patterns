
package patterns.memento;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public final class OriginatorTest {

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
