
package coaching.exceptions;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Unit tests showing handling Checked Exception classes.
 */
public final class CheckedExceptionTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory
        .getLogger(CheckedExceptionTest.class);

    /**
     * Unit Test to checked exception.
     *
     * @throws CheckedException
     *             the checked exception
     */
    @Test(expected = CheckedException.class)
    public void testCheckedException() throws CheckedException {
        throw new CheckedException();
    }
}
