
package patterns.template;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit tests for the ConcreteClass example.
 */
@Slf4j
public final class ConcreteClassTest {

    /**
     * Unit Test to primitive operation A.
     */
    @Test
    public void testPrimitiveOperationA() {
        final TemplateClass concreteClass = new TemplateClass();
        assertNotNull(concreteClass);
        assertNotNull(concreteClass.primitiveOperationAlice());
    }

    /**
     * Unit Test to primitive operation B.
     */
    @Test
    public void testPrimitiveOperationB() {
        final TemplateClass concreteClass = new TemplateClass();
        assertNotNull(concreteClass);
        assertNotNull(concreteClass.primitiveOperationBob());
    }

}
