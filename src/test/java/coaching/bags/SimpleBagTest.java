


package coaching.bags;

import static org.junit.Assert.*;

import org.junit.Test;
import org.slf4j.*;

import coaching.tuples.BoxTest;

/**
 * Unit Test examples for a Bag Class.
 */
public class SimpleBagTest {

	private static final Logger LOG = LoggerFactory.getLogger(BoxTest.class);
	private static final String[] VALUES = {
	        "Cat", "Dog", "Rabbit"
	};

	/**
	 * Unit Test to bag.
	 */
	@Test
	public void testBag() {
		final BagInterface bag = new SimpleBag();
		assertNotNull("Value cannot be null", bag);
	}

	/**
	 * Unit Test to bag string array.
	 */
	@Test
	public void testBagStringArray() {
		final SimpleBag bag = new SimpleBag(VALUES);
		assertNotNull("Value cannot be null", bag);
		verify(bag);
	}

	/**
	 * Unit Test to bag array.
	 */
	@Test
	public void testBagArray() {
		final String[] stuff = {
		        "Cat", "Dog", "Rabbit"
		};
		final SimpleBag bag = new SimpleBag(stuff);
		assertNotNull("Value cannot be null", bag);
		verify(bag);
	}

	/**
	 * Unit Test to bag vargs.
	 */
	@Test
	public void testBagVargs() {
		final SimpleBag bag = new SimpleBag("Cat", "Dog", "Rabbit");
		assertNotNull("Value cannot be null", bag);
		verify(bag);
	}

	/**
	 * Unit Test to fill.
	 */
	@Test
	public void testFill() {
		final SimpleBag bag = new SimpleBag();
		assertNotNull("Value cannot be null", bag);
		bag.fill(VALUES);
		verify(bag);
	}

	/**
	 * Unit Test to vargs.
	 */
	@Test
	public void testVargs() {
		final SimpleBag bag = new SimpleBag();
		assertNotNull("Value cannot be null", bag);
		bag.fill("Cat", "Dog", "Rabbit");
		verify(bag);
	}

	/**
	 * Test exhausted bag.
	 */
	@Test
	public void testExhaustedBag() {
		final String[] stuff = {
		        "Cat", "Dog", "Rabbit"
		};
		final SimpleBag bag = new SimpleBag(stuff);
		assertNotNull("Value cannot be null", bag);
		verify(bag);
	}

	/**
	 * Verify that.
	 *
	 * @param bag the bag
	 */
	private void verify(final SimpleBag bag) {
		assertNotNull("Value cannot be null", bag);
		assertEquals(3, bag.size());
		String choice = bag.choose();
		assertNotNull("Value cannot be null", choice);
		LOG.info(choice);
		assertEquals(2, bag.size());

		choice = bag.choose();
		assertNotNull("Value cannot be null", choice);
		LOG.info(choice);
		assertEquals(1, bag.size());

		choice = bag.choose();
		assertNotNull("Value cannot be null", choice);
		LOG.info(choice);
		assertEquals(0, bag.size());
	}

	/**
	 * Unit Test to choose.
	 */
	@Test
	public void testChoose() {
		final BagInterface bag = new SimpleBag(VALUES);
		assertNotNull("Value cannot be null", bag);
		final String chosen = bag.choose();
		assertNotNull("Value cannot be null", chosen);
	}

	/**
	 * Test null bag.
	 */
	@Test
	public void testNullBag() {
		final String[] stuff = null;
		final SimpleBag bag = new SimpleBag(stuff);
		assertEquals(0, bag.size());
		final String choice = bag.choose();
		assertNull(choice);
		assertEquals(0, bag.size());
	}

	/**
	 * Test empty bag.
	 */
	@Test
	public void testEmptyBag() {
		final String[] stuff = new String[0];
		final SimpleBag bag = new SimpleBag(stuff);
		assertEquals(0, bag.size());
		final String choice = bag.choose();
		assertNull(choice);
		assertEquals(0, bag.size());
	}

}