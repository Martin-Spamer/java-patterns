
package coaching.automation;

import org.junit.Test;

public class VerifyTest {

    @Test
    public void testVerifyThat() {
        Verify.that(true).isTrue();
        Verify.that(false).isFalse();
    }

}
