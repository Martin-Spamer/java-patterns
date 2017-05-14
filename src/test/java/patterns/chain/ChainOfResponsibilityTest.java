package patterns.chain;

import org.junit.Test;

public class ChainOfResponsibilityTest {

	@Test
	public void testHandleRequest() {
		final AbstractHandler one = new HandlerOne();
		final AbstractHandler two = new HandlerTwo();
		final Request request = new Request("Payload");
	}

}
