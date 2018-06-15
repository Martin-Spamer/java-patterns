
package coaching.template;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * class ConcreteClassTest.
 */
public class ConcreteClassTest {

    /**
     * Unit Test to primitive operation A.
     */
    @Test
    public void testPrimitiveOperationA() {
        final ConcreteTemplate concreteClass = new ConcreteTemplate();
        assertNotNull("Value cannot be null", concreteClass);
        assertNotNull("Value cannot be null", concreteClass.primitiveOperationAlice());
    }

    /**
     * Unit Test to primitive operation B.
     */
    @Test
    public void testPrimitiveOperationB() {
        final ConcreteTemplate concreteClass = new ConcreteTemplate();
        assertNotNull("Value cannot be null", concreteClass);
        assertNotNull("Value cannot be null", concreteClass.primitiveOperationBob());
    }

}
