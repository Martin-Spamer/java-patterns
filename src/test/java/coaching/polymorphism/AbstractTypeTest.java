
package coaching.polymorphism;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit tests for the AbstractType class.
 */


@Slf4j
public final class AbstractTypeTest {

    /** The abstract type. */
    private TypeInterface abstractType;

    /**
     * Unit Test to one.
     */
    @Test
    public void testSubTypeOne() {
        log.info("testSubTypeOnePolymorphism");
        abstractType = new SubTypeOne();
        assertNotNull(abstractType);
        log.info(abstractType.toString());
        assertNotNull(abstractType.operation());
        log.info(abstractType.toString());
    }

    /**
     * Unit Test to two.
     */
    @Test
    public void testSubTypeTwo() {
        log.info("testSubTypeOnePolymorphism");
        abstractType = new SubTypeTwo();
        assertNotNull(abstractType);
        log.info(abstractType.toString());
        abstractType.operation();
        assertNotNull(abstractType.operation());
        log.info(abstractType.toString());
    }

}
