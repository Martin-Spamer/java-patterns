package coaching.exceptions;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import coaching.exceptions.CustomExceptionHandling.*;

public class CustomExceptionHandlingTest {

	@Test(expected = CustomCreationException.class)
	public void testSubProcessA() throws CustomCreationException {
		final CustomExceptionHandling customExceptionHandling = new CustomExceptionHandling();
		assertNotNull(customExceptionHandling);
		customExceptionHandling.subProcessA();
	}

	@Test(expected = CustomReadException.class)
	public void testSubProcessB() throws CustomReadException {
		final CustomExceptionHandling customExceptionHandling = new CustomExceptionHandling();
		assertNotNull(customExceptionHandling);
		customExceptionHandling.subProcessB();
	}

	@Test(expected = CustomUpdateException.class)
	public void testSubProcessC() throws CustomUpdateException {
		final CustomExceptionHandling customExceptionHandling = new CustomExceptionHandling();
		assertNotNull(customExceptionHandling);
		customExceptionHandling.subProcessC();
	}

	@Test
	public void testProcess() throws Exception {
		final CustomExceptionHandling customExceptionHandling = new CustomExceptionHandling();
		assertNotNull(customExceptionHandling);
		customExceptionHandling.process();
	}

}
