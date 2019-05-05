
package coaching.exceptions;

import org.junit.Test;

import coaching.exceptions.CustomExceptionHandling.CustomCreationException;
import coaching.exceptions.CustomExceptionHandling.CustomException;
import coaching.exceptions.CustomExceptionHandling.CustomReadException;
import coaching.exceptions.CustomExceptionHandling.CustomUpdateException;
import lombok.extern.slf4j.Slf4j;

/**
 * Unit test for showing Custom Exception Handling.
 */


@Slf4j
public final class CustomExceptionHandlingTest {

    /**
     * Unit Test to sub process A.
     *
     * @throws CustomCreationException the custom creation exception
     */
    @Test(expected = CustomCreationException.class)
    public void testSubProcessA() throws CustomCreationException {
        new CustomExceptionHandling().creationProcess();
    }

    /**
     * Unit Test to sub process B.
     *
     * @throws CustomReadException the custom read exception
     */
    @Test(expected = CustomReadException.class)
    public void testSubProcessB() throws CustomReadException {
        new CustomExceptionHandling().readProcess();
    }

    /**
     * Unit Test to sub process C.
     *
     * @throws CustomUpdateException the custom update exception
     */
    @Test(expected = CustomUpdateException.class)
    public void testSubProcessC() throws CustomUpdateException {
        new CustomExceptionHandling().updateProcess();
    }

    /**
     * Unit Test to process.
     *
     * @throws CustomException the exception
     */
    @Test(expected = CustomCreationException.class)
    public void propagateException() throws CustomException {
        new CustomExceptionHandling().propagateException();
    }

    /**
     * Catch base custom exception.
     */
    @Test
    public void catchBaseCustomException() {
        new CustomExceptionHandling().catchBaseCustomException();
    }

    /**
     * Catch multiple exceptions.
     */
    @Test
    public void catchMultiExceptions() {
        new CustomExceptionHandling().catchMultiExceptions();
    }

    /**
     * Catch each exception.
     */
    @Test
    public void catchEachException() {
        new CustomExceptionHandling().catchEachException();
    }

    /**
     * Nested process.
     */
    @Test
    public void nestedProcess() {
        new CustomExceptionHandling().nestedProcess();
    }

    /**
     * Failsafe process.
     */
    @Test
    public void failsafeProcess() {
        new CustomExceptionHandling().failsafeProcess();
    }
}
