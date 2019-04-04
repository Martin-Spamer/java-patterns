
package patterns.router;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * class RouteTest.
 */
@Slf4j
public final class RouteTest {

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
        assertNotNull(route);
        route.sendMessage(new Message());
        Message receivedMessage = route.receiveMessage();
        assertNotNull(receivedMessage);
    }

}
