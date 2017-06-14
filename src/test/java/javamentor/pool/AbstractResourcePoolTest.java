
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
		assertTrue(testResourcePool.countFree() == 0);
		assertTrue(testResourcePool.countUsed() == 0);
		assertNotNull(testResourcePool.add(true));
		assertNotNull(testResourcePool.add(false));
		assertTrue(testResourcePool.countFree() == 2);
		assertTrue(testResourcePool.countUsed() == 0);
	}

	/**
	 * Test remove.
	 */
	@Test
	public void testRemove() {
		final TestResourcePool testResourcePool = new TestResourcePool();
		assertTrue(testResourcePool.countFree() == 0);
		assertTrue(testResourcePool.countUsed() == 0);
		testResourcePool.add(true);
		testResourcePool.add(false);
		assertTrue(testResourcePool.countFree() == 2);
		assertTrue(testResourcePool.countUsed() == 0);
	}

	/**
	 * Test offer.
	 */
	@Test
	public void testOffer() {
		final TestResourcePool testResourcePool = new TestResourcePool();
		assertNotNull(testResourcePool);
		assertTrue(testResourcePool.countFree() == 0);
		assertTrue(testResourcePool.countUsed() == 0);
		assertTrue(testResourcePool.offer(true));
		assertTrue(testResourcePool.offer(false));
		assertTrue(testResourcePool.countFree() == 2);
		assertTrue(testResourcePool.countUsed() == 0);
	}

	/**
	 * Test remove when null.
	 */
	@Test
	public void testRemoveWhenNull() {
		final TestResourcePool testResourcePool = new TestResourcePool();
		assertNotNull(testResourcePool);
		assertTrue(testResourcePool.countFree() == 0);
		assertTrue(testResourcePool.countUsed() == 0);
		assertNotNull(testResourcePool.remove(null));
		assertTrue(testResourcePool.countFree() == 0);
		assertTrue(testResourcePool.countUsed() == 0);
	}

	/**
	 * Test get when empty.
	 */
	@Test
	public void testGetWhenEmpty() {
		final TestResourcePool testResourcePool = new TestResourcePool();
		assertNotNull(testResourcePool);
		assertTrue(testResourcePool.countFree() == 0);
		assertTrue(testResourcePool.countUsed() == 0);
		assertNull(testResourcePool.take());
		assertNull(testResourcePool.take());
		assertTrue(testResourcePool.countFree() == 0);
		assertTrue(testResourcePool.countUsed() == 0);
	}

	/**
	 * Test get.
	 */
	@Test
	public void testGet() {
		final TestResourcePool testResourcePool = new TestResourcePool();
		assertNotNull(testResourcePool);
		testResourcePool.add(true);
		testResourcePool.add(false);
		assertTrue(testResourcePool.take() != null);
		assertTrue(testResourcePool.take() != null);
		assertNull(testResourcePool.take());
		assertTrue(testResourcePool.countFree() == 0);
		assertTrue(testResourcePool.countUsed() == 2);
	}

	/**
	 * Test release.
	 */
	@Test
	public void testRelease() {
		final TestResourcePool testResourcePool = new TestResourcePool();
		assertNotNull(testResourcePool);
		testResourcePool.add(true).add(false);
		assertTrue(testResourcePool.take() != null);
		assertTrue(testResourcePool.take() != null);
		assertTrue(testResourcePool.take() == null);
		assertEquals(0, testResourcePool.countFree());
		assertEquals(2, testResourcePool.countUsed());
	}

}
