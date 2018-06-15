
package coaching.solid;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * The Class InterfaceSegregationPrincipleTest.
 */
public class InterfaceSegregationPrincipleTest {

    /**
     * Test interface segregation principle.
     */
    @Test
    public void testInterfaceSegregationPrinciple() {
        final InterfaceSegregationPrinciple isp = new InterfaceSegregationPrinciple();
        assertNotNull("Value cannot be null", isp);
    }

}
