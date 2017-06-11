package patterns.command;

import org.junit.Test;

public class CommandParametersTest {

	public class MockCommandParameters extends AbstractParameters {
	}

	@Test
	public void testPutStringString() {
		final ParametersInterface commandParameters = new MockCommandParameters();
	}

	@Test
	public void testGetString() {
		final ParametersInterface commandParameters = new MockCommandParameters();
	}

}
