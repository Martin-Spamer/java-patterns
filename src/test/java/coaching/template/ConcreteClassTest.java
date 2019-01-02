
package coaching.template;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Unit tests for the ConcreteClass example.
 */
public final class ConcreteClassTest {

    /**
     * Unit Test to primitive operation A.
     */
    @Test
    public void testPrimitiveOperationA() {
        final Template concreteClass = new Template();
        assertNotNull(concreteClass);
        assertNotNull(concreteClass.primitiveOperationAlice());
    }

    /**
     * Unit Test to primitive operation B.
     */
    @Test
    public void testPrimitiveOperationB() {
        final Template concreteClass = new Template();
        assertNotNull(concreteClass);
        assertNotNull(concreteClass.primitiveOperationBob());
    }

}
