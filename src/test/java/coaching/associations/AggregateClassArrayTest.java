
package coaching.associations;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Unit test for AggregateClassArray class.
 */
public final class AggregateClassArrayTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(AggregateClassArrayTest.class);

    /**
     * Unit Test to execute.
     */
    @Test
    public void testExecute() {
        final AggregateClassArray aggregateClassArray = new AggregateClassArray();
        assertNotNull(aggregateClassArray);
        LOG.info("Empty : {}", aggregateClassArray.toString());

        final Alice alice = new Alice();
        assertEquals(alice, aggregateClassArray.setAggregate(0, alice).getAggregate(0));

        final Bob bob = new Bob();
        assertEquals(bob, aggregateClassArray.setAggregate(1, bob).getAggregate(1));

        final Charlie charlie = new Charlie();
        assertEquals(charlie, aggregateClassArray.setAggregate(2, charlie).getAggregate(2));

        final Dan dan = new Dan();
        assertEquals(dan, aggregateClassArray.setAggregate(3, dan).getAggregate(3));

        aggregateClassArray.execute();

        aggregateClassArray.execute(3).execute(2).execute(1).execute(0);

        LOG.info("Empty : {}", aggregateClassArray.toString());
    }

}
