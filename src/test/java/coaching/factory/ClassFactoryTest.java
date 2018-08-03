
package coaching.factory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class ClassFactoryTest {

    @Test
    public void testGetInstance() {
        final ClassFactory classFactory = ClassFactory.getInstance();
        assertEquals(classFactory, ClassFactory.getInstance());
    }

    @Test
    public void testGetInstanceString() {
        final ClassFactory classFactory = ClassFactory
            .getInstance("ClassFactory");
        assertEquals(classFactory, ClassFactory.getInstance());
    }

    @Test
    public void testCreate() throws Exception {
        assertNotNull(ClassFactory.create("money"));
        assertNotNull(ClassFactory.create("pounds"));
        assertNotNull(ClassFactory.create("big-money"));
    }

    @Test(expected = ClassCastException.class)
    public void testCreateString() throws Exception {
        assertNotNull(ClassFactory.create("string"));
    }

    @Test
    public void testNewInstance() throws Exception {
        assertNotNull(ClassFactory.newInstance("string"));
        assertNotNull(ClassFactory.newInstance("money"));
        assertNotNull(ClassFactory.newInstance("pounds"));
        assertNotNull(ClassFactory.newInstance("big-money"));
    }

    @Test
    public void testClassNameFor() {
        // Verify.that(ClassFactory.classNameFor("string")).is("java.lang.String");
        assertEquals("java.lang.String", ClassFactory.classNameFor("string"));
        assertEquals("coaching.money.Money",
                ClassFactory.classNameFor("money"));
        assertEquals("coaching.money.Pounds",
                ClassFactory.classNameFor("pounds"));
        assertEquals("coaching.money.BigDecimalMoney",
                ClassFactory.classNameFor("big-money"));
    }

    @Test
    public void testClassNameForMissing() {
        assertNull(ClassFactory.classNameFor("missing"));
    }

}
