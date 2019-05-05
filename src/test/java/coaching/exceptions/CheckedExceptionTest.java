
package coaching.exceptions;

import org.junit.Test;

/**
 * Unit tests showing handling Checked Exception classes.
 */
public final class CheckedExceptionTest {

    /**
     * Unit Test to checked exception.
     *
     * @throws CheckedException the checked exception
     */
    @Test(expected = CheckedException.class)
    public void testCheckedException() throws CheckedException {
        throw new CheckedException();
    }
}
