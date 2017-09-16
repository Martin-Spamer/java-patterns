package coaching.pool;

import static org.junit.Assert.*;

import org.junit.Test;
import org.slf4j.*;

/**
 * AbstractResourcePoolTest Class.
 */
public class AbstractResourcePoolTest {

	private static final Logger LOG = LoggerFactory.getLogger(AbstractResourcePoolTest.class);

	/**
	 * TestResourcePool Class.
	 */
	public class MockResourcePool extends AbstractResourcePool<Boolean> {
	}

	/**
	 * Test abstract resource pool constructor.
	 */
	@Test
	public void testAbstractResourcePool() {
		LOG.info("testAbstractResourcePool");
		assertNotNull(new MockResourcePool());
	}

	/**
	 * Test abstract resource pool typical usage.
	 */
	@Test
	public void testTypicalUsage() {
		LOG.info("testTypicalUsage");
		// Given a resource pool
		final MockResourcePool testResourcePool = new MockResourcePool();
		assertNotNull(testResourcePool);
		assertEquals(0, testResourcePool.countFree());
		assertEquals(0, testResourcePool.countUsed());
		testResourcePool.add(true);
		testResourcePool.add(false);
		assertEquals(2, testResourcePool.countFree());
		assertEquals(0, testResourcePool.countUsed());

		// * pool
		while (testResourcePool.countFree() > 0) {
			final Boolean bool = testResourcePool.take();
			if (bool) {
				testResourcePool.remove(bool);
			}
		}

		// Then
		assertEquals(0, testResourcePool.countFree());
		assertEquals(1, testResourcePool.countUsed());
	}

	/**
	 * Test add element to abstract resource pool.
	 */
	@Test
	public void testAdd() {
		LOG.info("testAdd");
		final MockResourcePool testResourcePool = new MockResourcePool();
		assertEquals(0, testResourcePool.countFree());
		assertEquals(0, testResourcePool.countUsed());
		assertNotNull(testResourcePool.add(true));
		assertNotNull(testResourcePool.add(false));
		assertEquals(2, testResourcePool.countFree());
		assertEquals(0, testResourcePool.countUsed());
	}

	/**
	 * Test remove abstract resource pool.
	 */
	@Test
	public void testRemove() {
		LOG.info("testRemove");
		final MockResourcePool testResourcePool = new MockResourcePool();
		assertEquals(0, testResourcePool.countFree());
		assertEquals(0, testResourcePool.countUsed());
		testResourcePool.add(true);
		testResourcePool.add(false);
		assertEquals(2, testResourcePool.countFree());
		assertEquals(0, testResourcePool.countUsed());
	}

	/**
	 * Test offer abstract resource pool.
	 */
	@Test
	public void testOffer() {
		LOG.info("testOffer");
		final MockResourcePool testResourcePool = new MockResourcePool();
		assertNotNull(testResourcePool);
		assertEquals(0, testResourcePool.countFree());
		assertEquals(0, testResourcePool.countUsed());
		assertTrue(testResourcePool.offer(true));
		assertTrue(testResourcePool.offer(false));
		assertEquals(2, testResourcePool.countFree());
		assertEquals(0, testResourcePool.countUsed());
	}

	/**
	 * Test remove from abstract resource pool when null.
	 */
	@Test
	public void testRemoveWhenNull() {
		LOG.info("testRemoveWhenNull");
		final MockResourcePool testResourcePool = new MockResourcePool();
		assertNotNull(testResourcePool);
		assertEquals(0, testResourcePool.countFree());
		assertEquals(0, testResourcePool.countUsed());
		assertNotNull(testResourcePool.remove(null));
		assertEquals(0, testResourcePool.countFree());
		assertEquals(0, testResourcePool.countUsed());
	}

	/**
	 * Test get from abstract resource pool when empty.
	 */
	@Test
	public void testGetWhenEmpty() {
		LOG.info("testGetWhenEmpty");
		final MockResourcePool testResourcePool = new MockResourcePool();
		assertNotNull(testResourcePool);
		assertEquals(0, testResourcePool.countFree());
		assertEquals(0, testResourcePool.countUsed());
		assertNull(testResourcePool.take());
		assertNull(testResourcePool.take());
		assertEquals(0, testResourcePool.countFree());
		assertEquals(0, testResourcePool.countUsed());
	}

	/**
	 * Test get from abstract resource pool.
	 */
	@Test
	public void testGet() {
		LOG.info("testGet");
		final MockResourcePool testResourcePool = new MockResourcePool();
		assertNotNull(testResourcePool);
		assertEquals(0, testResourcePool.countFree());
		assertEquals(0, testResourcePool.countUsed());
		testResourcePool.add(true);
		testResourcePool.add(false);
		assertNotNull(testResourcePool.take());
		assertNotNull(testResourcePool.take());
		assertNull(testResourcePool.take());
		assertEquals(0, testResourcePool.countFree());
		assertEquals(2, testResourcePool.countUsed());
	}

	/**
	 * Test release from abstract resource pool.
	 */
	@Test
	public void testRelease() {
		LOG.info("testRelease");
		final MockResourcePool testResourcePool = new MockResourcePool();
		assertNotNull(testResourcePool);
		assertEquals(0, testResourcePool.countFree());
		assertEquals(0, testResourcePool.countUsed());
		testResourcePool.add(true).add(false);
		assertTrue(testResourcePool.take() != null);
		assertTrue(testResourcePool.take() != null);
		assertTrue(testResourcePool.take() == null);
		assertEquals(0, testResourcePool.countFree());
		assertEquals(2, testResourcePool.countUsed());
	}

}
