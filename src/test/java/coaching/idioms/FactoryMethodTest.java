
package coaching.idioms;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import coaching.factory.FactoryMethod;

/**
 * Unit test class for FactoryMethod.
 */
public class FactoryMethodTest {

    /**
     * Unit test to create.
     */
    @Test
    public void testCreate() {
        final String create = FactoryMethod.create();
        assertNotNull(create);
    }

    /**
     * Unit test to create class name.
     */
    @Test
    public void testCreateClassName() {
        final String create = FactoryMethod.create("java.lang.String");
        assertNotNull(create);
    }

}
