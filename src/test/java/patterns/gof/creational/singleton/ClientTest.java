package patterns.gof.creational.singleton;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClientTest {

	@Test
	public void testSingleton() throws Exception {
		Singleton singleton = Singleton.getInstance();
		assertNotNull(singleton);
		assertEquals(singleton,Singleton.getInstance());
	}
}
