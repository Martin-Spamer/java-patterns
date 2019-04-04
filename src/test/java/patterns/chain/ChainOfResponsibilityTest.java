
package patterns.chain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * The ChainOfResponsibilityTest class.
 */
@Slf4j
public final class ChainOfResponsibilityTest {

    /**
     * Unit Test to handle request.
     */
    @Test
    public void testHandleRequest() {
        final Request request = new Request("Payload");
        assertNotNull(request);

        final AbstractHandler one = new HandlerOne();
        assertNotNull(one);

        final AbstractHandler two = new HandlerTwo();
        assertNotNull(two);

        assertEquals(one, one.setNext(two));
        assertEquals(one, one.handleRequest(request));
    }

}
