
package patterns.iterator;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * class AggregateTest.
 */
public final class AggregateTest {

    /**
     * Unit Test to create iterator.
     */
    @Test
    public void testCreateIterator() {
        final Aggregate aggregate = new Aggregate();
        assertNotNull(aggregate);
    }

}
