package idioms.pool;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import idioms.pool.BlockingPool;

/**
 * The BlockingPoolTest Class.
 */
public class BlockingPoolTest {

	private static final Logger LOG = LoggerFactory.getLogger(BlockingPoolTest.class);

	/**
	 * The TestResourcePool Class.
	 */
	public class TestResourcePool extends BlockingPool<Boolean> {
	}

	/**
	 * Test blocking pool.
	 */
	@Test
	public void testBlockingPool() {
		final TestResourcePool resourcePool = new TestResourcePool();
		assertNotNull(resourcePool);
		LOG.info(resourcePool.toString());
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

}
