


package coaching.associations;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.*;

import coaching.associations.AggregateClassArray;

/**
 * class AggregateClassArrayTest.
 */
public class AggregateClassArrayTest {

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
