
package coaching.solid;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * The Class DependencyInversionPrincipleTest.
 */
public class DependencyInversionPrincipleTest {

    /**
     * Test dependency inversion principle.
     */
    @Test
    public void testDependencyInversionPrinciple() {
        final DependencyInversionPrinciple dip = new DependencyInversionPrinciple();
        assertNotNull("Value cannot be null", dip);
    }

}
