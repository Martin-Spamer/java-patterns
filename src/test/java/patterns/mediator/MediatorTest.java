
package patterns.mediator;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit test Mediator class.
 */


@Slf4j
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
