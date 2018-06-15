
package patterns.router;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * class RouteTest.
 */
public class RouteTest {

    /**
     * class InputChanel.
     */
    public final class InputChanel extends AbstractInputChannel {
    }

    /**
     * class OutputChannel.
     */
    public final class OutputChannel extends AbstractOutputChannel {
    }

    /**
     * Unit Test to route.
     */
    @Test
    public void testRoute() {
        final OutputChannel outputChannel = new OutputChannel();
        final InputChanel inputChannel = new InputChanel();
        final Route route = new Route(outputChannel, inputChannel);
        assertNotNull("Value cannot be null", route);
    }

}
