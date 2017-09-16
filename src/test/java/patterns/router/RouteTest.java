package patterns.router;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class RouteTest {

	public class InputChanel extends AbstractInputChannel {
	}

	public class OutputChannel extends AbstractOutputChannel {
	}

	@Test
	public void testRoute() {
		assertNotNull(new Route(new OutputChannel(), new InputChanel()));
	}

}
