

package coaching.collections;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.*;

/**
 * class CompositeTest.
 */
public class CompositeTest {

	private static final Logger LOG = LoggerFactory.getLogger(CompositeTest.class);

	/**
	 * Unit Test to composite.
	 */
	@Test
	public void testComposite() {
		final Composite composite = new Composite();
		assertNotNull("Value cannot be null", composite);
		LOG.info("{}", composite);
	}

	/**
	 * Unit Test to composite alice bob charlie dan.
	 */
	@Test
	public void testCompositeAliceBobCharlieDan() {
		final ElementAlice alice = new ElementAlice();
		final ElementBob bob = new ElementBob();
		final ElementCharlie charlie = new ElementCharlie();
		final ElementDan dan = new ElementDan();
		final Composite composite = new Composite(alice, bob, charlie, dan);
		assertNotNull("Value cannot be null", composite);
		LOG.info("{}", composite);
	}

}
