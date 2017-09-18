package coaching.exceptions;

import org.junit.Test;

public class CheckedExceptionTest {

	@Test
	public void testCheckedException() throws CheckedException {
		throw new CheckedException();
	}

}
