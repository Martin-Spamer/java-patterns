
package coaching.idioms;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class FactoryMethodTest {

    @Test
    public void testCreate() {
        final String create = FactoryMethod.create();
        assertNotNull(create);
    }

    @Test
    public void testCreateClassName() {
        final String create = FactoryMethod.create("java.lang.String");
        assertNotNull(create);
    }

}
