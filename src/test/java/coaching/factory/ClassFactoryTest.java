
package coaching.factory;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ClassFactoryTest {

    @Test
    public void testCreate() {
        final Object object = ClassFactory.create();
        assertNotNull(object);
    }

}
