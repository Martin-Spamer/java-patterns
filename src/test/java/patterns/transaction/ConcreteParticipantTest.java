
package patterns.transaction;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * class ConcreteParticipantTest.
 */
public class ConcreteParticipantTest {

    /**
     * Unit Test to commit.
     */
    @Test
    public void testCommit() {
        final ConcreteParticipant testInstance = new ConcreteParticipant();
        assertNotNull("Value cannot be null", testInstance);
    }

}
