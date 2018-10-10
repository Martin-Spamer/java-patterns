
package coaching.solid;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Unit Test for the Interface Segregation Principle (ISP) example class. .
 */
public final class InterfaceSegregationPrincipleTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(InterfaceSegregationPrincipleTest.class);

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
