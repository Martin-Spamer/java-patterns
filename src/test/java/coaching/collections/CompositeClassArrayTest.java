package coaching.collections;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.*;

public class CompositeClassArrayTest {

	private static final Logger LOG = LoggerFactory.getLogger(CompositeClassArrayTest.class);

	@Test
	public void testCompositeClassArray() {
		final CompositeClassArray compositeClassArray = new CompositeClassArray();
		assertNotNull(compositeClassArray);
		LOG.info("{}", compositeClassArray.toString());
	}

}
