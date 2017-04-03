
package patterns.gof.creational.singleton;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * The Class ClientTest.
 */
public class ClientTest {

	/**
	 * Test singleton.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testSingleton() throws Exception {
		final Singleton singleton = Singleton.getInstance();
		assertNotNull(singleton);
		assertEquals(singleton, Singleton.getInstance());
	}
}
