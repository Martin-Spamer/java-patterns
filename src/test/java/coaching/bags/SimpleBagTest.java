
package coaching.bags;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import coaching.tuples.BoxTest;
import lombok.extern.slf4j.Slf4j;

/**
 * Unit test examples for a Bag class.
 */


@Slf4j
public final class SimpleBagTest {

    /** The Constant VALUES. */
    private static final String[] VALUES = { "Cat", "Dog", "Rabbit" };

    /**
     * Unit Test to bag.
     */
    @Test
    public void testBag() {
        log.info("testBag()");
        final BagInterface bag = new SimpleBag();
        assertNotNull(bag);
    }

    /**
     * Unit Test to bag string array.
     */
    @Test
    public void testBagStringArray() {
        log.info("testBagStringArray()");
        final SimpleBag bag = new SimpleBag(VALUES);
        assertNotNull(bag);
        verify(bag);
    }

    /**
     * Unit Test to bag vargs.
     */
    @Test
    public void testBagVargs() {
        log.info("testBagVargs()");
        final SimpleBag bag = new SimpleBag("Cat", "Dog", "Rabbit");
        assertNotNull(bag);
        verify(bag);
    }

    /**
     * Unit Test to fill.
     */
    @Test
    public void testFill() {
        log.info("testFill()");
        final SimpleBag bag = new SimpleBag();
        assertNotNull(bag);
        bag.fill(VALUES);
        verify(bag);
    }

    /**
     * Unit Test to vargs.
     */
    @Test
    public void testVargs() {
        log.info("testVargs()");
        final SimpleBag bag = new SimpleBag();
        assertNotNull(bag);
        bag.fill("Cat", "Dog", "Rabbit");
        verify(bag);
    }

    /**
     * Test exhausted bag.
     */
    @Test
    public void testExhaustedBag() {
        log.info("testExhaustedBag()");
        final String[] stuff = { "Cat", "Dog", "Rabbit" };
        final SimpleBag bag = new SimpleBag(stuff);
        assertNotNull(bag);
        verify(bag);
    }

    /**
     * Verify that.
     *
     * @param bag the bag
     */
    private void verify(final SimpleBag bag) {
        assertNotNull(bag);
        assertEquals(3, bag.size());
        String choice = bag.pick();
        assertNotNull(choice);
        log.info(choice);
        assertEquals(2, bag.size());

        choice = bag.pick();
        assertNotNull(choice);
        log.info(choice);
        assertEquals(1, bag.size());

        choice = bag.pick();
        assertNotNull(choice);
        log.info(choice);
        assertEquals(0, bag.size());
    }

    /**
     * Unit Test to choose.
     */
    @Test
    public void testChooseFromBag() {
        log.info("testChooseFromBag()");
        final BagInterface bag = new SimpleBag(VALUES);
        assertNotNull(bag);
        final String chosen = bag.pick();
        assertNotNull(chosen);
        final String pick = bag.pick();
        assertNotNull(pick);
        assertEquals(bag, bag.reset());
    }

    /**
     * Test null bag.
     */
    @Test
    public void testNullBag() {
        log.info("testNullBag()");
        final String[] stuff = null;
        final SimpleBag bag = new SimpleBag(stuff);
        assertEquals(0, bag.size());
        final String choice = bag.pick();
        assertNull(choice);
        assertEquals(0, bag.size());
    }

    /**
     * Test empty bag.
     */
    @Test
    public void testEmptyBag() {
        log.info("testEmptyBag()");
        final String[] stuff = new String[0];
        final SimpleBag bag = new SimpleBag(stuff);
        assertEquals(0, bag.size());
        final String choice = bag.pick();
        assertNull(choice);
        assertEquals(0, bag.size());
    }

}
