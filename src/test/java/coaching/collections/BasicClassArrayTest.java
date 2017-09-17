package coaching.collections;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.*;

public class BasicClassArrayTest {

	private static final Logger LOG = LoggerFactory.getLogger(BasicClassArrayTest.class);

	@Test
	public void testBasicClassArray() {
		final BasicClassArray basicClassArray = new BasicClassArray();
		assertNotNull(basicClassArray);
		LOG.info("{}", basicClassArray.toString());
	}

}
