
package coaching.exceptions;

import org.junit.Test;

/**
 * Unit tests for the UnCheckedException class.
 */
public final class UnCheckedExceptionTest {

    /**
     * Unit Test to unChecked exception.
     */
    @Test(expected = UnCheckedException.class)
    public void testUnCheckedException() {
        throw new UnCheckedException();
    }
}
