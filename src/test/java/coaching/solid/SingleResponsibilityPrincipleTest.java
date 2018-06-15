
package coaching.solid;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * class SingleResponsibilityPrincipleTest.
 */
public class SingleResponsibilityPrincipleTest {

    /**
     * Unit Test to responsibility.
     */
    @Test
    public void testResponsibility() {
        final SingleResponsibilityPrinciple srp = new SingleResponsibilityPrinciple();
        assertNotNull("Value cannot be null", srp);
        srp.responsibility();
    }

}
