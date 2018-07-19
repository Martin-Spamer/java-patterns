
package coaching.automation;

import org.junit.Test;

/**
 * Unit test class for Verify.
 */
public class VerifyTest {

    /**
     * Unit test to verify that.
     */
    @Test
    public void testVerifyThat() {
        Verify.that(true).isTrue();
        Verify.that(false).isFalse();
    }

}
