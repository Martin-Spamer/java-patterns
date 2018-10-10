
package coaching.factory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Unit test class for ClassFactory.
 */
public class ClassFactoryTest {

    /**
     * Unit test to get instance.
     */
    @Test
    public void testGetInstance() {
        final ClassFactory classFactory = ClassFactory.getInstance();
        assertEquals(classFactory, ClassFactory.getInstance());
    }

    /**
     * Unit test to get instance string.
     */
    @Test
    public void testGetInstanceString() {
        final ClassFactory classFactory = ClassFactory.getInstance("ClassFactory");
        assertEquals(classFactory, ClassFactory.getInstance());
    }

    /**
     * Unit test to create.
     *
     * @throws Exception the exception
     */
    @Test
    public void testCreate() throws Exception {
        assertNotNull(ClassFactory.create("money"));
        assertNotNull(ClassFactory.create("pounds"));
        assertNotNull(ClassFactory.create("big-money"));
    }

    /**
     * Unit test to create string.
     *
     * @throws Exception the exception
     */
    @Test(expected = ClassCastException.class)
    public void testCreateString() throws Exception {
        assertNotNull(ClassFactory.create("string"));
    }

    /**
     * Unit test to new instance.
     *
     * @throws Exception the exception
     */
    @Test
    public void testNewInstance() throws Exception {
        assertNotNull(ClassFactory.newInstance("string"));
        assertNotNull(ClassFactory.newInstance("money"));
        assertNotNull(ClassFactory.newInstance("pounds"));
        assertNotNull(ClassFactory.newInstance("big-money"));
    }

    /**
     * Unit test to class name for.
     */
    @Test
    public void testClassNameFor() {
        // Verify.that(ClassFactory.classNameFor("string")).is("java.lang.String");
        assertEquals("java.lang.String", ClassFactory.classNameFor("string"));
        assertEquals("coaching.money.Money", ClassFactory.classNameFor("money"));
        assertEquals("coaching.money.Pounds", ClassFactory.classNameFor("pounds"));
        assertEquals("coaching.money.BigDecimalMoney", ClassFactory.classNameFor("big-money"));
    }

    /**
     * Unit test to class name for missing.
     */
    @Test
    public void testClassNameForMissing() {
        assertNull(ClassFactory.classNameFor("missing"));
    }

}
