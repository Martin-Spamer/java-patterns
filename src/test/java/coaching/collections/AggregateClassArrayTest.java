package coaching.collections;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.*;

public class AggregateClassArrayTest {

	private static final Logger LOG = LoggerFactory.getLogger(AggregateClassArrayTest.class);

	@Test
	public void testExecute() {
		final AggregateClassArray aggregateClassArray = new AggregateClassArray();
		assertNotNull(aggregateClassArray);
		LOG.info("{}", aggregateClassArray.toString());
	}

}
