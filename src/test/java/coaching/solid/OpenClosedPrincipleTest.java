
package coaching.solid;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit Test for the Open Closed Principle (OCP) example class.
 */
@Slf4j
public final class OpenClosedPrincipleTest {

    /**
     * Unit Test to open closed principle example.
     */
    @Test
    public void testOpenClosedPrinciple() {
        final OpenClosedPrinciple ocp = new OpenClosedPrinciple();
        assertNotNull(ocp);
    }

}
