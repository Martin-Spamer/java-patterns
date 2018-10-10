
package patterns.memento;

import java.util.UUID;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for Originator class.
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
        final Originator originator = new Originator(stateOne);
        Memento actualOne = originator.getMemento();
        assertEquals(stateOne, actualOne.getState());

        // When
        originator.createMemento(stateTwo);
        Memento actualTwo = originator.getMemento();

        // Then
        assertEquals(stateTwo, actualTwo.getState());
        assertEquals(stateOne, actualOne.getState());
    }

}
