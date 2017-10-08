


package coaching.associations;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.*;

import coaching.associations.CompositeClassArray;

/**
 * class CompositeClassArrayTest.
 */
public class CompositeClassArrayTest {

	private static final Logger LOG = LoggerFactory.getLogger(CompositeClassArrayTest.class);

	/**
	 * Unit Test to composite class array.
	 */
	@Test
	public void testCompositeClassArray() {
		final CompositeClassArray compositeClassArray = new CompositeClassArray();
		assertNotNull("Value cannot be null", compositeClassArray);
		LOG.info("{}", compositeClassArray.toString());
	}

}
