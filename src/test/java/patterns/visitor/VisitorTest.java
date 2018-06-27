
package patterns.visitor;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Unit Test for Visitor class.
 *
 * Represent an operation to be performed on elements of an object structure.
 */
public class VisitorTest {

    /**
     * Unit Test to operation.
     */
    @Test
    public void testOperation() {
        final ConcreteVisitorOne visitorOne = new ConcreteVisitorOne();
        assertNotNull("Value cannot be null", visitorOne);

        final ConcreteVisitorTwo visitorTwo = new ConcreteVisitorTwo();
        assertNotNull("Value cannot be null", visitorTwo);
        
        final ConcreteElement element = new ConcreteElement();
        assertNotNull("Value cannot be null", element);
    }

}
