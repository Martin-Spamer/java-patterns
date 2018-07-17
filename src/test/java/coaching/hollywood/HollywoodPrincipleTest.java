
package coaching.hollywood;

import org.junit.Test;

public class HollywoodPrincipleTest {

    @Test
    public void testDontCallUs() {
        final HollywoodPrinciple hollywoodPrinciple = new HollywoodPrinciple();
        hollywoodPrinciple.dontCallUs();
    }

    @Test
    public void testWellCallYou() {
        final HollywoodPrinciple hollywoodPrinciple = new HollywoodPrinciple();
        hollywoodPrinciple.wellCallYou();
    }

}
