
package patterns.iterator;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * class AggregateTest.
 */
public class AggregateTest {

	/**
	 * Unit Test to create iterator.
	 */
	@Test
	public void testCreateIterator() {
		final Aggregate aggregate = new Aggregate();
		assertNotNull("Value cannot be null", aggregate);
	}

}
