
package coaching.solid;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit Test for the Single Responsibility Principle (SIP) example class.
 */


/** The Constant 			log. */
@Slf4j
public final class SingleResponsibilityPrincipleTest {

    /**
     * Unit Test shows multiple responsibility.
     */
    @Test
    public void testMultipleResponsibility() {
        final SingleResponsibilityPrinciple multiple = new SingleResponsibilityPrinciple();
        assertNotNull(multiple);
        multiple.multipleResponsibility();
        log.debug("multiple = {}", multiple.toString());
    }

    /**
     * Unit Test to single responsibility.
     */
    @Test
    public void testSingleResponsibility() {
        final SingleResponsibilityPrinciple srp = new SingleResponsibilityPrinciple();
        assertNotNull(srp);
        srp.singleResponsibility();
        log.debug("srp = {}", srp.toString());
    }
}
