
package patterns.chain;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * The ChainOfResponsibilityTest Class.
 */
public class ChainOfResponsibilityTest {

	/**
	 * Unit Test to handle request.
	 */
	@Test
	public void testHandleRequest() {
		final AbstractHandler one = new HandlerOne();
		assertNotNull(one);

		final AbstractHandler two = new HandlerTwo();
		assertNotNull(two);

		final Request request = new Request("Payload");
		assertNotNull(request);
	}

}
