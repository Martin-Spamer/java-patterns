package javamentor.bags;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javamentor.bags.Bag;
import javamentor.bags.BagInterface;
import javamentor.tuples.BoxTest;

public class BagTest {

	private static final Logger LOG = LoggerFactory.getLogger(BoxTest.class);
	private static final String[] VALUES = { "Cat", "Dog", "Rabbit" };

	@Test
	public void testBag() {
		final BagInterface bag = new Bag();
		assertNotNull(bag);
	}

	@Test
	public void testBagStringArray() {
		final Bag bag = new Bag(VALUES);
		assertNotNull(bag);
		verify(bag);
	}

	@Test
	public void testBagArray() {
		final String[] stuff = { "Cat", "Dog", "Rabbit" };
		final Bag bag = new Bag(stuff);
		verify(bag);
	}

	@Test
	public void testBagVargs() {
		final Bag bag = new Bag("Cat", "Dog", "Rabbit");
		verify(bag);
	}

	@Test
	public void testFill() {
		final Bag bag = new Bag();
		assertNotNull(bag);
		bag.fill(VALUES);
		verify(bag);
	}

	@Test
	public void testVargs() {
		final Bag bag = new Bag();
		assertNotNull(bag);
		bag.fill("Cat", "Dog", "Rabbit");
		verify(bag);
	}

	/**
	 * Test exhausted bag.
	 */
	@Test
	public void testExhaustedBag() {
		final String[] stuff = { "Cat", "Dog", "Rabbit" };
		final Bag bag = new Bag(stuff);
		verify(bag);
	}

	private void verify(final Bag bag) {
		assertEquals(3, bag.size());
		String choice = bag.choose();
		assertNotNull(choice);
		LOG.info(choice);
		assertEquals(2, bag.size());

		choice = bag.choose();
		assertNotNull(choice);
		LOG.info(choice);
		assertEquals(1, bag.size());

		choice = bag.choose();
		assertNotNull(choice);
		LOG.info(choice);
		assertEquals(0, bag.size());
	}

	@Test
	public void testChoose() {
		final BagInterface bag = new Bag(VALUES);
		assertNotNull(bag);
		final String chosen = bag.choose();
		assertNotNull(chosen);
	}

	/**
	 * Test null bag.
	 */
	@Test
	public void testNullBag() {
		final String[] stuff = null;
		final Bag bag = new Bag(stuff);
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
		final Bag bag = new Bag(stuff);
		assertEquals(0, bag.size());
		final String choice = bag.choose();
		assertNull(choice);
		assertEquals(0, bag.size());
	}

}
