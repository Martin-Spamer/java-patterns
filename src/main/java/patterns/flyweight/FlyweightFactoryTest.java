
package patterns.flyweight;

import org.junit.Test;

/**
 * The FlyweightFactoryTest Class.
 */
public class FlyweightFactoryTest {

	/**
	 * Unit Test to create.
	 */
	@Test
	public void testCreate() {
		final FlyweightFactory flyweightFactory = new FlyweightFactory();
		final FlyWeight create = flyweightFactory.create();
	}

}
