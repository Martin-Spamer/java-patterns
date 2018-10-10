
package coaching.solid;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Unit Test for the Open Closed Principle (OCP) example class.
 */
public final class OpenClosedPrincipleTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(OpenClosedPrincipleTest.class);

    /**
     * Unit Test to open closed principle example.
     */
    @Test
    public void testOpenClosedPrinciple() {
        final OpenClosedPrinciple ocp = new OpenClosedPrinciple();
        assertNotNull(ocp);
    }

}
