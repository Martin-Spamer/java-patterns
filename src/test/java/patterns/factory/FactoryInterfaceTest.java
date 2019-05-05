
package patterns.factory;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * FactoryInterfaceTest class.
 */


@Slf4j
public final class FactoryInterfaceTest {

    /**
     * Unit Test to factory one.
     */
    @Test
    public void testFactoryOne() {
        log.info("testFactoryOne");
        final ConcreteFactoryOne factory = new ConcreteFactoryOne();
        assertNotNull(factory);
        final AbstractProductAlpha productA = factory.createProductA();
        assertNotNull(productA);
        final AbstractProductBeta productB = factory.createProductB();
        assertNotNull(productB);
    }

    /**
     * Unit Test to factory two.
     */
    @Test
    public void testFactoryTwo() {
        log.info("testFactoryOne");
        final ConcreteFactoryTwo factory = new ConcreteFactoryTwo();
        assertNotNull(factory);
        final AbstractProductAlpha productA = factory.createProductA();
        assertNotNull(productA);
        final AbstractProductBeta productB = factory.createProductB();
        assertNotNull(productB);
    }

}
