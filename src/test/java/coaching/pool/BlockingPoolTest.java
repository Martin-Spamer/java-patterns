
package coaching.pool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit tests for the BlockingPool class.
 */


/** The Constant 			log. */
@Slf4j
public final class BlockingPoolTest {

    /**
     * TestResourcePool Class.
     */
    public final class TestResourcePool extends AbstractBlockingPool<Boolean> {
    }

    /**
     * Test blocking pool.
     */
    @Test
    public void testBlockingPool() {
        final TestResourcePool resourcePool = new TestResourcePool();
        assertNotNull(resourcePool);
        log.info(resourcePool.toString());
    }

    /**
     * Unit test typical usage..
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
            if (bool) {
                testResourcePool.remove(bool);
            }
        }

        // Then
        assertEquals(0, testResourcePool.countFree());
        assertEquals(1, testResourcePool.countUsed());
    }

}
