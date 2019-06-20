
package coaching.associations;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit test for AggregateClassArray class.
 */


/** The Constant 			log. */
@Slf4j
public final class AggregateClassArrayTest {

    /**
     * Unit Test to execute.
     */
    @Test
    public void testExecute() {
        final AggregateClassArray aggregateClassArray = new AggregateClassArray();
        assertNotNull(aggregateClassArray);
        log.info("Empty : {}", aggregateClassArray.toString());

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

        log.info("Empty : {}", aggregateClassArray.toString());
    }

}
