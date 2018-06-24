
package coaching.solid;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

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
