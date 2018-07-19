
package coaching.hollywood;

import org.junit.Test;

/**
 * Unit test class for HollywoodPrinciple.
 */
public class HollywoodPrincipleTest {

    /**
     * Unit test to dont call us.
     */
    @Test
    public void testDontCallUs() {
        final HollywoodPrinciple hollywoodPrinciple = new HollywoodPrinciple();
        hollywoodPrinciple.dontCallUs();
    }

    /**
     * Unit test to well call you.
     */
    @Test
    public void testWellCallYou() {
        final HollywoodPrinciple hollywoodPrinciple = new HollywoodPrinciple();
        hollywoodPrinciple.wellCallYou();
    }

}
