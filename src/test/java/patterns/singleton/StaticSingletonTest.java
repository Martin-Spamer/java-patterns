package patterns.singleton;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class StaticSingletonTest {

	@Test
	public void testGetInstance() {
		assertNotNull(StaticSingleton.getInstance());
	}

}
