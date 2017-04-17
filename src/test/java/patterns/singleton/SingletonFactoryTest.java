package patterns.singleton;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class SingletonFactoryTest {

	@Test
	public void testGetInstance() {
		assertNotNull(SingletonFactory.getInstance());
	}

}
