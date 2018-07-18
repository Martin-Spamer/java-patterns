
package coaching.factory;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ClassFactoryTest {

    @Test
    public void testCreate() {
        final Object instance = ClassFactory.create();
        assertNotNull(instance);
    }

    @Test
    public void testCreateByKey() {
        final Object instance = ClassFactory
            .create("coaching.factory.ClassFactory");
        assertNotNull(instance);
    }

}
