package patterns.singleton;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SingletonTest {

	private static final Logger LOG = LoggerFactory.getLogger(SingletonTest.class);

	@Test
	public void testSingleton() {
		assertNotNull(Singleton.getInstance());
	}

}
