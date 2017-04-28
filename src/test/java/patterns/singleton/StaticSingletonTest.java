package patterns.singleton;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StaticSingletonTest {

	private static final Logger LOG = LoggerFactory.getLogger(StaticSingletonTest.class);

	@Test
	public void testGetInstance() {
		final StaticSingleton instance = StaticSingleton.getInstance();
		assertNotNull(instance);
		final String string = instance.toString();
		assertNotNull(instance);
		LOG.info(string);
	}

}
