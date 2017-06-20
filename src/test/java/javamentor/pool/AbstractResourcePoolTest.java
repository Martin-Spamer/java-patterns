
package javamentor.pool;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * AbstractResourcePoolTest Class.
 */
public class AbstractResourcePoolTest {

	private static final Logger LOG = LoggerFactory.getLogger(AbstractResourcePoolTest.class);

	/**
	 * TestResourcePool Class.
	 */
	public class TestResourcePool extends AbstractResourcePool<Boolean> {
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
		assertEquals(0, testResourcePool.countFree());
		assertEquals(0, testResourcePool.countUsed());
		testResourcePool.add(true);
		testResourcePool.add(false);
		assertEquals(2, testResourcePool.countFree());
		assertEquals(0, testResourcePool.countUsed());

		// * pool
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
	 * Test add.
	 */
	@Test
	public void testAdd() {
		final TestResourcePool testResourcePool = new TestResourcePool();
		assertEquals(0, testResourcePool.countFree());
		assertEquals(0, testResourcePool.countUsed());
		assertNotNull(testResourcePool.add(true));
		assertNotNull(testResourcePool.add(false));
		assertEquals(2, testResourcePool.countFree());
		assertEquals(0, testResourcePool.countUsed());
	}

	/**
	 * Test remove.
	 */
	@Test
	public void testRemove() {
		final TestResourcePool testResourcePool = new TestResourcePool();
		assertEquals(0, testResourcePool.countFree());
		assertEquals(0, testResourcePool.countUsed());
		testResourcePool.add(true);
		testResourcePool.add(false);
		assertEquals(2, testResourcePool.countFree());
		assertEquals(0, testResourcePool.countUsed());
	}

	/**
	 * Test offer.
	 */
	@Test
	public void testOffer() {
		final TestResourcePool testResourcePool = new TestResourcePool();
		assertNotNull(testResourcePool);
		assertEquals(0, testResourcePool.countFree());
		assertEquals(0, testResourcePool.countUsed());
		assertTrue(testResourcePool.offer(true));
		assertTrue(testResourcePool.offer(false));
		assertEquals(2, testResourcePool.countFree());
		assertEquals(0, testResourcePool.countUsed());
	}

	/**
	 * Test remove when null.
	 */
	@Test
	public void testRemoveWhenNull() {
		final TestResourcePool testResourcePool = new TestResourcePool();
		assertNotNull(testResourcePool);
		assertEquals(0, testResourcePool.countFree());
		assertEquals(0, testResourcePool.countUsed());
		assertNotNull(testResourcePool.remove(null));
		assertEquals(0, testResourcePool.countFree());
		assertEquals(0, testResourcePool.countUsed());
	}

	/**
	 * Test get when empty.
	 */
	@Test
	public void testGetWhenEmpty() {
		final TestResourcePool testResourcePool = new TestResourcePool();
		assertNotNull(testResourcePool);
		assertEquals(0, testResourcePool.countFree());
		assertEquals(0, testResourcePool.countUsed());
		assertNull(testResourcePool.take());
		assertNull(testResourcePool.take());
		assertEquals(0, testResourcePool.countFree());
		assertEquals(0, testResourcePool.countUsed());
	}

	/**
	 * Test get.
	 */
	@Test
	public void testGet() {
		final TestResourcePool testResourcePool = new TestResourcePool();
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
	 * Test release.
	 */
	@Test
	public void testRelease() {
		final TestResourcePool testResourcePool = new TestResourcePool();
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
