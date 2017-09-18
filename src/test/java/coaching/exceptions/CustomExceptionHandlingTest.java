package coaching.exceptions;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomExceptionHandlingTest {

	@Test
	public void testSubProcessA() throws Exception {
		final CustomExceptionHandling customExceptionHandling = new CustomExceptionHandling();
		assertNotNull(customExceptionHandling);
		customExceptionHandling.subProcessA();
	}

	@Test
	public void testSubProcessB() throws Exception {
		final CustomExceptionHandling customExceptionHandling = new CustomExceptionHandling();
		assertNotNull(customExceptionHandling);
		customExceptionHandling.subProcessB();
	}

	@Test
	public void testSubProcessC() throws Exception {
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

	@Test
	public void testMain() {
		fail("Not yet implemented");
	}

}
