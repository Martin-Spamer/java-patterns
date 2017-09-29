package patterns.iterator;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class AggregateTest {

	@Test
	public void testCreateIterator() {
		final Aggregate aggregate = new Aggregate();
		assertNotNull("Value cannot be null",aggregate);
	}

}
