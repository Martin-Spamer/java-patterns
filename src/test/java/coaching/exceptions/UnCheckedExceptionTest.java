
package coaching.exceptions;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Unit tests for the UnCheckedException class.
 */
public final class UnCheckedExceptionTest {

    private static final Logger LOG = LoggerFactory
        .getLogger(UnCheckedExceptionTest.class);

    /**
     * Unit Test to unChecked exception.
     */
    @Test(expected = UnCheckedException.class)
    public void testUnCheckedException() {
        throw new UnCheckedException();
    }
}
