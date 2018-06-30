
package coaching.polymorphism;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * The AbstractTypeTest Class.
 */
public class AbstractTypeTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(AbstractTypeTest.class);

    /** The abstract type. */
    private TypeInterface abstractType;

    /**
     * Unit Test to one.
     */
    @Test
    public void testSubTypeOne() {
        LOG.info("testPolymorphism");
        abstractType = new SubTypeOne();
        assertNotNull(abstractType);
        LOG.info("{}", abstractType);
        assertNotNull(abstractType.operation());
        LOG.info("{}", abstractType);
    }

    /**
     * Unit Test to two.
     */
    @Test
    public void testSubTypeTwo() {
        LOG.info("testPolymorphism");
        LOG.info("{}", abstractType);
        abstractType = new SubTypeTwo();
        assertNotNull(abstractType);
        LOG.info("{}", abstractType);
        abstractType.operation();
        assertNotNull(abstractType.operation());
        LOG.info("{}", abstractType);
    }

}
