package patterns.flyweight;

import org.junit.Test;

public class FlyweightFactoryTest {

	@Test
	public void testCreate() {
		final FlyweightFactory flyweightFactory = new FlyweightFactory();
		final FlyWeight create = flyweightFactory.create();
	}

}
