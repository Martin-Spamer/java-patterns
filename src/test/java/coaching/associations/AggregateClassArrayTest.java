
package coaching.associations;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * class AggregateClassArrayTest.
 */
public class AggregateClassArrayTest {

    /** The Constant LOG. */
    private static final Logger LOG = LoggerFactory.getLogger(AggregateClassArrayTest.class);

    /**
     * Unit Test to execute.
     */
    @Test
    public void testExecute() {
        final AggregateClassArray aggregateClassArray = new AggregateClassArray();
        assertNotNull("Value cannot be null", aggregateClassArray);
        LOG.info("{}", aggregateClassArray.toString());
    }

}
