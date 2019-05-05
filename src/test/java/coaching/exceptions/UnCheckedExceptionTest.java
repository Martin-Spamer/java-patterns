
package coaching.exceptions;

import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit tests for the UnCheckedException class.
 */


@Slf4j
public final class UnCheckedExceptionTest {

    /**
     * Unit Test to unChecked exception.
     */
    @Test(expected = UnCheckedException.class)
    public void testUnCheckedException() {
        throw new UnCheckedException();
    }
}
