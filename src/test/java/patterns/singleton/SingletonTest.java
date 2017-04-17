package patterns.singleton;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class SingletonTest {

	@Test
	public void testSingleton() {
		assertNotNull(Singleton.getInstance());
	}

}
