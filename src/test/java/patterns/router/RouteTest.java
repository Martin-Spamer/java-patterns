package patterns.router;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class RouteTest {

	public final class InputChanel extends AbstractInputChannel {
	}

	public final class OutputChannel extends AbstractOutputChannel {
	}

	@Test
	public void testRoute() {
		final OutputChannel outputChannel = new OutputChannel();
		final InputChanel inputChannel = new InputChanel();
		final Route route = new Route(outputChannel, inputChannel);
		assertNotNull("Value cannot be null",route);
	}

}
