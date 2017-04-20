package patterns.singleton;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SingletonFactoryTest {

	private static final Logger LOG = LoggerFactory.getLogger(SingletonFactoryTest.class);

	@Test
	public void testGetInstance() {
		assertNotNull(SingletonFactory.getInstance());
	}

}
