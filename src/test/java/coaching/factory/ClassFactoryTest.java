package coaching.factory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ClassFactoryTest {

    @Test
    public void testGetInstance() {
        ClassFactory classFactory = ClassFactory.getInstance();
        assertEquals(classFactory, ClassFactory.getInstance());
    }

    @Test
    public void testGetInstanceString() {
        ClassFactory classFactory = ClassFactory.getInstance("ClassFactory");
        assertEquals(classFactory,ClassFactory.getInstance());
    }

    @Test
    public void testClassNameFor() {
        assertEquals("java.math.BigDecimal", ClassFactory.classNameFor("big-decimal"));
        assertEquals("java.math.BigInteger", ClassFactory.classNameFor("big-integer"));
        assertEquals("java.lang.Boolean", ClassFactory.classNameFor("boolean"));
        assertEquals("java.lang.Byte", ClassFactory.classNameFor("byte"));
        assertEquals("java.lang.Character", ClassFactory.classNameFor("character"));
        assertEquals("java.lang.Double", ClassFactory.classNameFor("double"));
        assertEquals("java.lang.Float", ClassFactory.classNameFor("float"));
        assertEquals("java.lang.Integer", ClassFactory.classNameFor("integer"));
        assertEquals("java.lang.Long", ClassFactory.classNameFor("long"));
        assertEquals("java.lang.Short", ClassFactory.classNameFor("short"));
        assertEquals("java.lang.String",ClassFactory.classNameFor("string"));
    }

    @Test
    public void testCreate() throws Exception {
        assertNotNull(ClassFactory.create());
    }

    @Test
    public void testCreateNumber() throws Exception {
        assertNotNull(ClassFactory.create("number"));
    }

    @Test(expected=ClassCastException.class)
    public void testCreateString() throws Exception {
        assertNotNull(ClassFactory.create("string"));
    }

    @Test
    public void testNewInstance() throws Exception {
        assertNotNull(ClassFactory.newInstance("string"));
    }

}
