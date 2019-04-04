
package coaching.exceptions;

import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit tests showing handling Checked Exception classes.
 */
@Slf4j
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
