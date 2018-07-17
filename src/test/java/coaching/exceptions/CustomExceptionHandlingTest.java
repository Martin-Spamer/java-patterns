
package coaching.exceptions;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

import coaching.exceptions.CustomExceptionHandling.CustomCreationException;
import coaching.exceptions.CustomExceptionHandling.CustomReadException;
import coaching.exceptions.CustomExceptionHandling.CustomUpdateException;

/**
 * Unit test for showing Custom Exception Handling.
 */
public final class CustomExceptionHandlingTest {

    private static final Logger LOG = LoggerFactory
        .getLogger(CustomExceptionHandlingTest.class);

    /**
     * Unit Test to sub process A.
     *
     * @throws CustomCreationException
     *             the custom creation exception
     */
    @Test(expected = CustomCreationException.class)
    public void testSubProcessA() throws CustomCreationException {
        final CustomExceptionHandling customExceptionHandling = new CustomExceptionHandling();
        assertNotNull(customExceptionHandling);
        customExceptionHandling.creationProcess();
    }

    /**
     * Unit Test to sub process B.
     *
     * @throws CustomReadException
     *             the custom read exception
     */
    @Test(expected = CustomReadException.class)
    public void testSubProcessB() throws CustomReadException {
        final CustomExceptionHandling customExceptionHandling = new CustomExceptionHandling();
        assertNotNull(customExceptionHandling);
        customExceptionHandling.readProcess();
    }

    /**
     * Unit Test to sub process C.
     *
     * @throws CustomUpdateException
     *             the custom update exception
     */
    @Test(expected = CustomUpdateException.class)
    public void testSubProcessC() throws CustomUpdateException {
        final CustomExceptionHandling customExceptionHandling = new CustomExceptionHandling();
        assertNotNull(customExceptionHandling);
        customExceptionHandling.updateProcess();
    }

    /**
     * Unit Test to process.
     *
     * @throws Exception
     *             the exception
     */
    @Test(expected = CustomCreationException.class)
    public void propagateException() throws Exception {
        final CustomExceptionHandling customExceptionHandling = new CustomExceptionHandling();
        assertNotNull(customExceptionHandling);
        customExceptionHandling.propagateException();
    }

    @Test
    public void catchBaseCustomException() {
        final CustomExceptionHandling customExceptionHandling = new CustomExceptionHandling();
        assertNotNull(customExceptionHandling);
        customExceptionHandling.catchBaseCustomException();
    }

    @Test
    public void catchMultiExceptions() {
        final CustomExceptionHandling customExceptionHandling = new CustomExceptionHandling();
        assertNotNull(customExceptionHandling);
        customExceptionHandling.catchMultiExceptions();
    }

    @Test
    public void catchEachException() {
        final CustomExceptionHandling customExceptionHandling = new CustomExceptionHandling();
        assertNotNull(customExceptionHandling);
        customExceptionHandling.catchEachException();
    }

    @Test
    public void nestedProcess() throws Exception {
        final CustomExceptionHandling customExceptionHandling = new CustomExceptionHandling();
        assertNotNull(customExceptionHandling);
        customExceptionHandling.nestedProcess();
    }

    @Test
    public void failsafeProcess() throws Exception {
        final CustomExceptionHandling customExceptionHandling = new CustomExceptionHandling();
        assertNotNull(customExceptionHandling);
        customExceptionHandling.failsafeProcess();
    }

}
