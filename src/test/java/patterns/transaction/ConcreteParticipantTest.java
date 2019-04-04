
package patterns.transaction;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * class ConcreteParticipantTest.
 */
@Slf4j
public final class ConcreteParticipantTest {

    /**
     * Unit Test to commit.
     */
    @Test
    public void testCommit() {
        final ConcreteParticipant testInstance = new ConcreteParticipant();
        assertNotNull(testInstance);
    }

}
