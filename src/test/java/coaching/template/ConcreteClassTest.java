
package coaching.template;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Unit tests for the ConcreteClass example.
 */
public final class ConcreteClassTest {

    private static final Logger LOG = LoggerFactory.getLogger(ConcreteClassTest.class);

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
