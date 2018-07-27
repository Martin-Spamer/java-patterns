
package coaching.factory;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Unit test class for ClassFactory.
 */
public class ClassFactoryTest {

    /**
     * Unit test to create.
     */
    @Test
    public void testCreate() {
        final Object instance = ClassFactory.create();
        assertNotNull(instance);
    }

    /**
     * Unit test to create by key.
     */
    @Test
    public void testCreateByKey() {
        final Object instance = ClassFactory
            .create("coaching.factory.ClassFactory");
        assertNotNull(instance);
    }

}
