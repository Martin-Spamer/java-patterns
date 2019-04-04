
package coaching.solid;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit Test for the Interface Segregation Principle (ISP) example class. .
 */
@Slf4j
public final class InterfaceSegregationPrincipleTest {

    /**
     * Unit Test for the interface segregation principle example java example
     * class.
     */
    @Test
    public void testInterfaceSegregationPrinciple() {
        final InterfaceSegregationPrinciple isp = new InterfaceSegregationPrinciple();
        assertNotNull(isp);
    }

}
