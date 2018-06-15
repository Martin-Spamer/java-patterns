
package patterns.mediator;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * class MediatorTest.
 */
public class MediatorTest {

    /**
     * Unit Test to.
     */
    @Test
    public void test() {
        final Mediator mediator = new Mediator();
        assertNotNull("Value cannot be null", mediator);
    }
}
