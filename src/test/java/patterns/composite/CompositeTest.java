package patterns.composite;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.*;

public class CompositeTest {

	private static final Logger LOG = LoggerFactory.getLogger(CompositeTest.class);

	@Test
	public void testComposite() {
		final Component composite = new Composite();
		assertNotNull("Value cannot be null",composite);

		final Leaf leaf = new Leaf();
		assertNotNull("Value cannot be null",leaf);

		assertNotNull("Value cannot be null",composite.add(leaf));
		LOG.info("{}", composite.toString());
	}
}
