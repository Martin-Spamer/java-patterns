
package coaching.exceptions;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import coaching.exceptions.CustomExceptionHandling.CustomCreationException;
import coaching.exceptions.CustomExceptionHandling.CustomReadException;
import coaching.exceptions.CustomExceptionHandling.CustomUpdateException;

/**
 * Unit test for showing Custom Exception Handling.
 */
public final class CustomExceptionHandlingTest {

    /**
     * Unit Test to sub process A.
     *
     * @throws CustomCreationException the custom creation exception
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
     * @throws CustomReadException the custom read exception
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
     * @throws CustomUpdateException the custom update exception
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
     * @throws Exception the exception
     */
    @Test(expected = CustomCreationException.class)
    public void propagateException() throws Exception {
        final CustomExceptionHandling customExceptionHandling = new CustomExceptionHandling();
        assertNotNull(customExceptionHandling);
        customExceptionHandling.propagateException();
    }

    /**
     * Catch base custom exception.
     */
    @Test
    public void catchBaseCustomException() {
        final CustomExceptionHandling customExceptionHandling = new CustomExceptionHandling();
        assertNotNull(customExceptionHandling);
        customExceptionHandling.catchBaseCustomException();
    }

    /**
     * Catch multi exceptions.
     */
    @Test
    public void catchMultiExceptions() {
        final CustomExceptionHandling customExceptionHandling = new CustomExceptionHandling();
        assertNotNull(customExceptionHandling);
        customExceptionHandling.catchMultiExceptions();
    }

    /**
     * Catch each exception.
     */
    @Test
    public void catchEachException() {
        final CustomExceptionHandling customExceptionHandling = new CustomExceptionHandling();
        assertNotNull(customExceptionHandling);
        customExceptionHandling.catchEachException();
    }

    /**
     * Nested process.
     *
     * @throws Exception the exception
     */
    @Test
    public void nestedProcess() throws Exception {
        final CustomExceptionHandling customExceptionHandling = new CustomExceptionHandling();
        assertNotNull(customExceptionHandling);
        customExceptionHandling.nestedProcess();
    }

    /**
     * Failsafe process.
     *
     * @throws Exception the exception
     */
    @Test
    public void failsafeProcess() throws Exception {
        final CustomExceptionHandling customExceptionHandling = new CustomExceptionHandling();
        assertNotNull(customExceptionHandling);
        customExceptionHandling.failsafeProcess();
    }

}
