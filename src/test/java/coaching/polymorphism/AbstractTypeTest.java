
package coaching.polymorphism;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Unit tests for the AbstractType class.
 */
public final class AbstractTypeTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(AbstractTypeTest.class);

    /** The abstract type. */
    private TypeInterface abstractType;

    /**
     * Unit Test to one.
     */
    @Test
    public void testSubTypeOne() {
        LOG.info("testSubTypeOnePolymorphism");
        abstractType = new SubTypeOne();
        assertNotNull(abstractType);
        LOG.info(abstractType.toString());
        assertNotNull(abstractType.operation());
        LOG.info(abstractType.toString());
    }

    /**
     * Unit Test to two.
     */
    @Test
    public void testSubTypeTwo() {
        LOG.info("testSubTypeOnePolymorphism");
        abstractType = new SubTypeTwo();
        assertNotNull(abstractType);
        LOG.info(abstractType.toString());
        abstractType.operation();
        assertNotNull(abstractType.operation());
        LOG.info(abstractType.toString());
    }

}
