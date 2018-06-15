
package coaching.solid;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * class OpenClosedPrincipleTest.
 */
public class OpenClosedPrincipleTest {

    /**
     * Unit Test to open closed principle.
     */
    @Test
    public void testOpenClosedPrinciple() {
        final OpenClosedPrinciple ocp = new OpenClosedPrinciple();
        assertNotNull("Value cannot be null", ocp);
    }

}
