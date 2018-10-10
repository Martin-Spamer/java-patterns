
package patterns.mediator;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Unit test Mediator class.
 */
public final class MediatorTest {

    /**
     * Unit Test for Mediator class.
     */
    @Test
    public void testMediator() {
        final Mediator mediator = new Mediator();
        assertNotNull(mediator);
    }
}
