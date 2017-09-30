
package patterns.singleton;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.*;

/**
 * Singleton Factory Test Class.
 */
public class SingletonFactoryTest {

	private static final Logger LOG = LoggerFactory.getLogger(SingletonFactoryTest.class);

	/**
	 * Unit Test to get instance.
	 */
	@Test
	public void testGetInstance() {
		final SingletonFactory instance = SingletonFactory.getInstance();
		assertNotNull("Value cannot be null", instance);
		final String string = instance.toString();
		assertNotNull("Value cannot be null", instance);
		LOG.info("{}", string);

	}

}
