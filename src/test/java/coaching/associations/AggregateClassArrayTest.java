
package coaching.associations;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
        LOG.info(aggregateClassArray.toString());
    }

}
