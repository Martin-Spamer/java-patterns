package idioms.pool;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import idioms.pool.ConcurrentPool;

/**
 * The ConcurrentPoolTest Class.
 */
public class ConcurrentPoolTest {

	private static final Logger LOG = LoggerFactory.getLogger(ConcurrentPoolTest.class);

	/**
	 * The TestResourcePool Class.
	 */
	public class TestResourcePool extends ConcurrentPool<Boolean> {
	}

	/**
	 * Test abstract resource pool.
	 */
	@Test
	public void testAbstractResourcePool() {
		assertNotNull(new TestResourcePool());
	}

	/**
	 * Test typical usage.
	 */
	@Test
	public void testTypicalUsage() {
		// Given a resource pool
		final TestResourcePool testResourcePool = new TestResourcePool();
		assertNotNull(testResourcePool);
		testResourcePool.add(true);
		testResourcePool.add(false);
		assertEquals(2, testResourcePool.countFree());
		assertEquals(0, testResourcePool.countUsed());

		// When we exhaust the pool
		while (testResourcePool.countFree() > 0) {
			final Boolean bool = testResourcePool.take();
			if (bool == true) {
				testResourcePool.remove(bool);
			}
		}

		// Then
		assertEquals(0, testResourcePool.countFree());
		assertEquals(1, testResourcePool.countUsed());
	}

	/**
	 * Test concurrent pool.
	 */
	@Test
	public void testConcurrentPool() {
		final TestResourcePool testResourcePool = new TestResourcePool();
		assertNotNull(testResourcePool);
	}

}
