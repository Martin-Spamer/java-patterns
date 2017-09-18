package patterns.singleton;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.*;

/**
 * Singleton Test Class.
 */
public class SingletonTest {

	private static final Logger LOG = LoggerFactory.getLogger(SingletonTest.class);

	/**
	 * Unit Test to singleton.
	 */
	@Test
	public void testSingleton() {
		final Singleton instance = Singleton.getInstance();
		assertNotNull(instance);
		final String string = instance.toString();
		assertNotNull(instance);
		LOG.info("{}", string);
	}

}
