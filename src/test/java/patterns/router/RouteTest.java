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
		OutputChannel outputChannel = new OutputChannel();
		InputChanel inputChannel = new InputChanel();
		Route route = new Route(outputChannel, inputChannel);
		assertNotNull(route);
	}

}
