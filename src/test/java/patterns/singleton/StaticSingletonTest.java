
package patterns.singleton;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Static Singleton Test Class.
 */
public class StaticSingletonTest {

	private static final Logger LOG = LoggerFactory.getLogger(StaticSingletonTest.class);

	/**
	 * Unit Test to get instance.
	 */
	@Test
	public void testGetInstance() {
		final StaticSingleton instance = StaticSingleton.getInstance();
		assertNotNull("Value cannot be null", instance);
		final String string = instance.toString();
		assertNotNull("Value cannot be null", instance);
		LOG.info("{}", string);
	}

}
